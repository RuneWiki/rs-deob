import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.Proxy.Type;
import java.nio.charset.Charset;
import java.util.List;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class42 extends class174 {
   @OriginalMember(
      owner = "client!fo",
      name = "j",
      descriptor = "Ljava/net/ProxySelector;"
   )
   private ProxySelector field641 = ProxySelector.getDefault();
   @OriginalMember(
      owner = "client!fo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field644 = new String[]{method489(method488("V6g2BR2e}\u0019O2B*\u001fH2|\u0003\u001eS/x6\u001f")), method489(method488("H%d6")), method489(method488("\u0006x>")), method489(method488("T#e#\u001f")), method489(method488("T#e#")), method489(method488("\u001c\u001fE\u0007<\u0013f?cf6")), method489(method488("\u007f\u0018_\u001d)\u007f\u00031")), method489(method488("t\u0003E\u0003C\ry!sX\f`")), method489(method488("L%~+\u0015\u00116d'\u0004Y9e:\u000f]#tiL")), method489(method488("t\u0003E\u0003C\ry s^\fg")), method489(method488("t\u0003E\u0003C\ry!s^\fg")), method489(method488("\u001c\u001fE\u0007<\u0013f?cf")), method489(method488("t\u0003E\u0003C\ry sX\f`")), method489(method488("u\u0004^~T\u0004b(~]")), method489(method488("6]")), method489(method488("O\"a#\u0003N#b\u0003\u001eY2|#\u0018U!t\u0012\u0019H?~!\u0005F6e:\u0003R")), method489(method488("[2e\u001b\t]3t!\"]:t")), method489(method488("V6g2BR2e}9n\u001b")), method489(method488("[2e\u001b\t]3t!:];d6")), method489(method488("[2e\u0003\u001eS/h\u0012\u0019H?")), method489(method488("V6g2BP6\u007f4Bo#c:\u0002[")), method489(method488("O\"\u007f}\u0002Y#?$\u001bKya!\u0003H8r<\u0000\u0012?e'\u001c\u0012\u0016d'\u0004Y9e:\u000f]#x<\u0002u9w<")), method489(method488("\u0006w")), method489(method488("T#e#\u001f\u0006x>"))};
   @OriginalMember(
      owner = "client!fo",
      name = "i",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field642;
   @OriginalMember(
      owner = "client!fo",
      name = "h",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field643;

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(B)Ljava/net/Socket;"
   )
   public final Socket method485(byte arg0) throws IOException {
      if (arg0 <= 98) {
         this.field641 = (ProxySelector)null;
      }

      boolean var2 = Boolean.parseBoolean(System.getProperty(field644[0]));
      if (!var2) {
         System.setProperty(field644[0], field644[1]);
      }

      boolean var3 = this.field2592 == 443;

      List var4;
      List var5;
      try {
         var4 = this.field641.select(new URI((!var3 ? field644[4] : field644[3]) + field644[2] + this.field2595));
         var5 = this.field641.select(new URI((!var3 ? field644[3] : field644[4]) + field644[2] + this.field2595));
      } catch (URISyntaxException var18) {
         return this.method1605(false);
      }

      var4.addAll(var5);
      Object[] var7 = var4.toArray();
      class710 var8 = null;
      Object[] var9 = var7;

      for(int var10 = 0; var10 < var9.length; ++var10) {
         Object var11 = var9[var10];
         Proxy var12 = (Proxy)var11;

         try {
            Socket var13 = this.method486(var12, 71);
            if (var13 != null) {
               return var13;
            }
         } catch (class710 var16) {
            var8 = var16;
         } catch (IOException var17) {
         }
      }

      if (var8 == null) {
         return this.method1605(false);
      } else {
         throw var8;
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "httpProxyConnect",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;"
   )
   private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
      Socket var4 = new Socket(arg0, arg1);
      var4.setSoTimeout(10000);
      OutputStream var5 = var4.getOutputStream();
      if (arg2 != null) {
         var5.write((field644[6] + this.field2595 + ":" + this.field2592 + field644[11] + arg2 + field644[14]).getBytes(Charset.forName(field644[13])));
      } else {
         var5.write((field644[6] + this.field2595 + ":" + this.field2592 + field644[5]).getBytes(Charset.forName(field644[13])));
      }

      var5.flush();
      BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
      String var7 = var6.readLine();
      if (var7 != null) {
         if (var7.startsWith(field644[10]) || var7.startsWith(field644[9])) {
            return var4;
         }

         if (var7.startsWith(field644[7]) || var7.startsWith(field644[12])) {
            int var8 = 0;
            String var9 = field644[8];
            String var10 = var6.readLine();

            while(var10 != null && ~var8 > -51) {
               if (var10.toLowerCase().startsWith(var9)) {
                  String var11 = var10.substring(var9.length()).trim();
                  int var12 = var11.indexOf(32);
                  if (~var12 != 0) {
                     var11 = var11.substring(0, var12);
                  }

                  throw new class710(var11);
               }

               var10 = var6.readLine();
               ++var8;
            }

            throw new class710("");
         }
      }

      var5.close();
      var6.close();
      var4.close();
      return null;
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(Ljava/net/Proxy;I)Ljava/net/Socket;"
   )
   private final Socket method486(Proxy arg0, int arg1) throws IOException {
      if (arg0.type() != Type.DIRECT) {
         int var3 = -80 % ((6 - arg1) / 55);
         SocketAddress var4 = arg0.address();
         if (!(var4 instanceof InetSocketAddress)) {
            return null;
         } else {
            InetSocketAddress var5 = (InetSocketAddress)var4;
            if (arg0.type() == Type.HTTP) {
               String var6 = null;

               try {
                  Class var7 = Class.forName(field644[21]);
                  Method var8 = var7.getDeclaredMethod(field644[19], field642 == null ? (field642 = method487(field644[20])) : field642, Integer.TYPE);
                  var8.setAccessible(true);
                  Object var9 = var8.invoke((Object)null, var5.getHostName(), new Integer(var5.getPort()));
                  if (var9 != null) {
                     Method var10 = var7.getDeclaredMethod(field644[15]);
                     var10.setAccessible(true);
                     if ((Boolean)var10.invoke(var9)) {
                        Method var11 = var7.getDeclaredMethod(field644[16]);
                        var11.setAccessible(true);
                        Method var12 = var7.getDeclaredMethod(field644[18], field643 == null ? (field643 = method487(field644[17])) : field643, field642 == null ? (field642 = method487(field644[20])) : field642);
                        var12.setAccessible(true);
                        String var13 = (String)var11.invoke(var9);
                        String var14 = (String)var12.invoke(var9, new URL(field644[23] + this.field2595 + "/"), field644[3]);
                        var6 = var13 + field644[22] + var14;
                     }
                  }
               } catch (Exception var17) {
               }

               return this.httpProxyConnect(var5.getHostName(), var5.getPort(), var6);
            } else if (arg0.type() != Type.SOCKS) {
               return null;
            } else {
               Socket var16 = new Socket(arg0);
               var16.connect(new InetSocketAddress(this.field2595, this.field2592));
               return var16;
            }
         }
      } else {
         return this.method1605(false);
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method487(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   @OriginalMember(
      owner = "client!fo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method488(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method489(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
