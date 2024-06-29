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

@OriginalClass("client!pda")
public class class659 extends class90 {
   @OriginalMember(
      owner = "client!pda",
      name = "p",
      descriptor = "Ljava/net/ProxySelector;"
   )
   private ProxySelector field9402 = ProxySelector.getDefault();
   @OriginalMember(
      owner = "client!pda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9405 = new String[]{method4786(method4785("\u0013=\\\u0000#jG9p8k^")), method4786(method4785("\u0013=\\\u0000#jG9p>kY")), method4786(method4785("+\u001bg(uv\b}$d>\u0007|9o:\u001dmj,")), method4786(method4785("\u0018&F\u001eI\u0018=(")), method4786(method4785("\u0013=\\\u0000#jG8p8k^")), method4786(method4785("{!\\\u0004\\tX&`\u0006Q")), method4786(method4785("\u0012:G}4c\\1}=")), method4786(method4785("\u0013=\\\u0000#jG8p>kY")), method4786(method4785("{!\\\u0004\\tX&`\u0006")), method4786(method4785("Qc")), method4786(method4785("/\u001b}5")), method4786(method4785("aF'")), method4786(method4785("1\b~1\"5\f|~y(\f[)\u007f/\fe\u0000~4\u0011a5\u007f")), method4786(method4785("3\u001d| ")), method4786(method4785("3\u001d| \u007f")), method4786(method4785("1\b~1\"7\bf7\"\b\u001dz9b<")), method4786(method4785("<\f|\u0000~4\u0011q\u0011y/\u0001")), method4786(method4785("(\u001cx c)\u001d{\u0000~>\fe x2\u001fm\u0011y/\u0001g\"e!\b|9c5")), method4786(method4785("3\u001d| \u007faF'")), method4786(method4785("<\f|\u0018i:\rm\"Z:\u0005}5")), method4786(method4785("aI")), method4786(method4785("<\f|\u0018i:\rm\"B:\u0004m")), method4786(method4785("1\b~1\"5\f|~Y\t%")), method4786(method4785("(\u001cf~b>\u001d&'{,Gx\"c/\u0006k?`u\u0001|$|u(}$d>\u0007|9o:\u001da?b\u0012\u0007n?"))};
   @OriginalMember(
      owner = "client!pda",
      name = "o",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9403;
   @OriginalMember(
      owner = "client!pda",
      name = "n",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field9404;

   @OriginalMember(
      owner = "client!pda",
      name = "httpProxyConnect",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;"
   )
   private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
      Socket var4 = new Socket(arg0, arg1);
      var4.setSoTimeout(10000);
      OutputStream var5 = var4.getOutputStream();
      if (arg2 != null) {
         var5.write((field9405[3] + this.field1146 + ":" + this.field1144 + field9405[8] + arg2 + field9405[9]).getBytes(Charset.forName(field9405[6])));
      } else {
         var5.write((field9405[3] + this.field1146 + ":" + this.field1144 + field9405[5]).getBytes(Charset.forName(field9405[6])));
      }

      var5.flush();
      BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
      String var7 = var6.readLine();
      if (var7 != null) {
         if (var7.startsWith(field9405[7]) || var7.startsWith(field9405[1])) {
            return var4;
         }

         if (var7.startsWith(field9405[4]) || var7.startsWith(field9405[0])) {
            int var8 = 0;
            String var9 = var6.readLine();
            String var10 = field9405[2];

            while(var9 != null && 50 > var8) {
               if (var9.toLowerCase().startsWith(var10)) {
                  String var11 = var9.substring(var10.length()).trim();
                  int var12 = var11.indexOf(32);
                  if (~var12 != 0) {
                     var11 = var11.substring(0, var12);
                  }

                  throw new class737(var11);
               }

               ++var8;
               var9 = var6.readLine();
            }

            throw new class737("");
         }
      }

      var5.close();
      var6.close();
      var4.close();
      return null;
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(I)Ljava/net/Socket;"
   )
   public final Socket method858(int arg0) throws IOException {
      if (arg0 <= 100) {
         this.field9402 = (ProxySelector)null;
      }

      boolean var2 = Boolean.parseBoolean(System.getProperty(field9405[12]));
      if (!var2) {
         System.setProperty(field9405[12], field9405[10]);
      }

      boolean var3 = ~this.field1144 == -444;

      List var4;
      List var5;
      try {
         var4 = this.field9402.select(new URI((!var3 ? field9405[13] : field9405[14]) + field9405[11] + this.field1146));
         var5 = this.field9402.select(new URI((!var3 ? field9405[14] : field9405[13]) + field9405[11] + this.field1146));
      } catch (URISyntaxException var18) {
         return this.method856(false);
      }

      var4.addAll(var5);
      Object[] var7 = var4.toArray();
      class737 var8 = null;
      Object[] var9 = var7;

      for(int var10 = 0; ~var10 > ~var9.length; ++var10) {
         Object var11 = var9[var10];
         Proxy var12 = (Proxy)var11;

         try {
            Socket var13 = this.method4783(79, var12);
            if (var13 != null) {
               return var13;
            }
         } catch (class737 var16) {
            var8 = var16;
         } catch (IOException var17) {
         }
      }

      if (var8 == null) {
         return this.method856(false);
      } else {
         throw var8;
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;"
   )
   private final Socket method4783(int arg0, Proxy arg1) throws IOException {
      if (arg1.type() != Type.DIRECT) {
         SocketAddress var3 = arg1.address();
         if (!(var3 instanceof InetSocketAddress)) {
            return null;
         } else {
            if (arg0 < 6) {
               this.field9402 = (ProxySelector)null;
            }

            InetSocketAddress var4 = (InetSocketAddress)var3;
            if (arg1.type() != Type.HTTP) {
               if (arg1.type() == Type.SOCKS) {
                  Socket var5 = new Socket(arg1);
                  var5.connect(new InetSocketAddress(this.field1146, this.field1144));
                  return var5;
               } else {
                  return null;
               }
            } else {
               String var6 = null;

               try {
                  Class var7 = Class.forName(field9405[23]);
                  Method var8 = var7.getDeclaredMethod(field9405[16], field9403 == null ? (field9403 = method4784(field9405[15])) : field9403, Integer.TYPE);
                  var8.setAccessible(true);
                  Object var9 = var8.invoke((Object)null, var4.getHostName(), new Integer(var4.getPort()));
                  if (var9 != null) {
                     Method var10 = var7.getDeclaredMethod(field9405[17]);
                     var10.setAccessible(true);
                     if ((Boolean)var10.invoke(var9)) {
                        Method var11 = var7.getDeclaredMethod(field9405[21]);
                        var11.setAccessible(true);
                        Method var12 = var7.getDeclaredMethod(field9405[19], field9404 == null ? (field9404 = method4784(field9405[22])) : field9404, field9403 == null ? (field9403 = method4784(field9405[15])) : field9403);
                        var12.setAccessible(true);
                        String var13 = (String)var11.invoke(var9);
                        String var14 = (String)var12.invoke(var9, new URL(field9405[18] + this.field1146 + "/"), field9405[14]);
                        var6 = var13 + field9405[20] + var14;
                     }
                  }
               } catch (Exception var16) {
               }

               return this.httpProxyConnect(var4.getHostName(), var4.getPort(), var6);
            }
         }
      } else {
         return this.method856(false);
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method4784(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4785(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4786(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
