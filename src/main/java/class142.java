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

@OriginalClass("client!hw")
public class class142 extends class249 {
   @OriginalMember(
      owner = "client!hw",
      name = "h",
      descriptor = "Ljava/net/ProxySelector;"
   )
   private ProxySelector field1808 = ProxySelector.getDefault();
   @OriginalMember(
      owner = "client!hw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1811 = new String[]{method1125(method1124("Wxu9\t.\u0002\u0011I\u0014/\u001c")), method1125(method1124("?du=v0\u001d\u000fY,\u0015")), method1125(method1124("Wxu9\t.\u0002\u0010I\u0012/\u001b")), method1125(method1124("?du=v0\u001d\u000fY,")), method1125(method1124("\\co'c\\x\u0001")), method1125(method1124("V\u007fnD\u001e'\u0019\u0018D\u0017")), method1125(method1124("Wxu9\t.\u0002\u0010I\u0014/\u001c")), method1125(method1124("\u0015&")), method1125(method1124("o^N\u0011_2MT\u001dNzBU\u0000E~XDS\u0006")), method1125(method1124("Wxu9\t.\u0002\u0011I\u0012/\u001b")), method1125(method1124("wXU\u0019")), method1125(method1124("uMW\b\bqIUGSlIr\u0010UkIL9TpTH\fU")), method1125(method1124("k^T\f")), method1125(method1124("wXU\u0019U")), method1125(method1124("%\u0003\u000e")), method1125(method1124("%\f")), method1125(method1124("lYOGHzX\u000f\u001eQh\u0002Q\u001bIkCB\u0006J1DU\u001dV1mT\u001dNzBU\u0000E~XH\u0006HVBG\u0006")), method1125(method1124("xIU!C~HD\u001bp~@T\f")), method1125(method1124("wXU\u0019U%\u0003\u000e")), method1125(method1124("lYQ\u0019ImXR9TzIL\u0019RvZD(SkDN\u001bOeMU\u0000Iq")), method1125(method1124("xIU9TpTX(SkD")), method1125(method1124("xIU!C~HD\u001bh~AD")), method1125(method1124("uMW\b\bsMO\u000e\bLXS\u0000Hx")), method1125(method1124("uMW\b\bqIUGsM`"))};
   @OriginalMember(
      owner = "client!hw",
      name = "i",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1809;
   @OriginalMember(
      owner = "client!hw",
      name = "j",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field1810;

   @OriginalMember(
      owner = "client!hw",
      name = "httpProxyConnect",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;"
   )
   private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
      Socket var4 = new Socket(arg0, arg1);
      var4.setSoTimeout(10000);
      OutputStream var5 = var4.getOutputStream();
      if (arg2 != null) {
         var5.write((field1811[4] + this.field3432 + ":" + this.field3431 + field1811[3] + arg2 + field1811[7]).getBytes(Charset.forName(field1811[5])));
      } else {
         var5.write((field1811[4] + this.field3432 + ":" + this.field3431 + field1811[1]).getBytes(Charset.forName(field1811[5])));
      }

      var5.flush();
      BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
      String var7 = var6.readLine();
      if (var7 != null) {
         if (var7.startsWith(field1811[0]) || var7.startsWith(field1811[6])) {
            return var4;
         }

         if (var7.startsWith(field1811[9]) || var7.startsWith(field1811[2])) {
            int var8 = 0;
            String var9 = var6.readLine();
            String var10 = field1811[8];

            while(var9 != null && 50 > var8) {
               if (var9.toLowerCase().startsWith(var10)) {
                  String var11 = var9.substring(var10.length()).trim();
                  int var12 = var11.indexOf(32);
                  if (~var12 != 0) {
                     var11 = var11.substring(0, var12);
                  }

                  throw new class86(var11);
               }

               ++var8;
               var9 = var6.readLine();
            }

            throw new class86("");
         }
      }

      var5.close();
      var6.close();
      var4.close();
      return null;
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(ILjava/net/Proxy;)Ljava/net/Socket;"
   )
   private final Socket method1121(int arg0, Proxy arg1) throws IOException {
      if (arg1.type() != Type.DIRECT) {
         if (arg0 != 0) {
            return (Socket)null;
         } else {
            SocketAddress var3 = arg1.address();
            if (var3 instanceof InetSocketAddress) {
               InetSocketAddress var4 = (InetSocketAddress)var3;
               if (arg1.type() != Type.HTTP) {
                  if (arg1.type() == Type.SOCKS) {
                     Socket var5 = new Socket(arg1);
                     var5.connect(new InetSocketAddress(this.field3432, this.field3431));
                     return var5;
                  } else {
                     return null;
                  }
               } else {
                  String var6 = null;

                  try {
                     Class var7 = Class.forName(field1811[16]);
                     Method var8 = var7.getDeclaredMethod(field1811[20], field1809 == null ? (field1809 = method1123(field1811[22])) : field1809, Integer.TYPE);
                     var8.setAccessible(true);
                     Object var9 = var8.invoke((Object)null, var4.getHostName(), new Integer(var4.getPort()));
                     if (var9 != null) {
                        Method var10 = var7.getDeclaredMethod(field1811[19]);
                        var10.setAccessible(true);
                        if ((Boolean)var10.invoke(var9)) {
                           Method var11 = var7.getDeclaredMethod(field1811[21]);
                           var11.setAccessible(true);
                           Method var12 = var7.getDeclaredMethod(field1811[17], field1810 == null ? (field1810 = method1123(field1811[23])) : field1810, field1809 == null ? (field1809 = method1123(field1811[22])) : field1809);
                           var12.setAccessible(true);
                           String var13 = (String)var11.invoke(var9);
                           String var14 = (String)var12.invoke(var9, new URL(field1811[18] + this.field3432 + "/"), field1811[13]);
                           var6 = var13 + field1811[15] + var14;
                        }
                     }
                  } catch (Exception var16) {
                  }

                  return this.httpProxyConnect(var4.getHostName(), var4.getPort(), var6);
               }
            } else {
               return null;
            }
         }
      } else {
         return this.method1919((byte)48);
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(I)Ljava/net/Socket;"
   )
   public final Socket method1122(int arg0) throws IOException {
      boolean var2 = Boolean.parseBoolean(System.getProperty(field1811[11]));
      if (!var2) {
         System.setProperty(field1811[11], field1811[12]);
      }

      boolean var3 = ~this.field3431 == -444;

      List var4;
      List var5;
      try {
         var4 = this.field1808.select(new URI((var3 ? field1811[13] : field1811[10]) + field1811[14] + this.field3432));
         var5 = this.field1808.select(new URI((!var3 ? field1811[13] : field1811[10]) + field1811[14] + this.field3432));
      } catch (URISyntaxException var18) {
         return this.method1919((byte)48);
      }

      var4.addAll(var5);
      if (arg0 != 6677) {
         this.field1808 = (ProxySelector)null;
      }

      Object[] var7 = var4.toArray();
      class86 var8 = null;
      Object[] var9 = var7;

      for(int var10 = 0; ~var10 > ~var9.length; ++var10) {
         Object var11 = var9[var10];
         Proxy var12 = (Proxy)var11;

         try {
            Socket var13 = this.method1121(0, var12);
            if (var13 != null) {
               return var13;
            }
         } catch (class86 var16) {
            var8 = var16;
         } catch (IOException var17) {
         }
      }

      if (var8 == null) {
         return this.method1919((byte)48);
      } else {
         throw var8;
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method1123(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   @OriginalMember(
      owner = "client!hw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1124(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1125(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
