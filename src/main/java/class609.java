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

@OriginalClass("client!kha")
public class class609 extends class698 {
   @OriginalMember(
      owner = "client!kha",
      name = "h",
      descriptor = "Ljava/net/ProxySelector;"
   )
   private ProxySelector field8926 = ProxySelector.getDefault();
   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8929 = new String[]{method4442(method4441("N61\u000fy")), method4442(method4441("\u001cmj")), method4442(method4441("N61\u000f")), method4442(method4441("R00\u001a")), method4442(method4441("L#3\u001e$H'1Q\u007fU'\u0016\u0006yR'(/xI:,\u001ay")), method4442(method4441("n\u0016\u0011/%\u0017lt_8\u0016r")), method4442(method4441("n\u0016\u0011/%\u0017lt_>\u0016u")), method4442(method4441("e\r\u000b1Oe\u0016e")), method4442(method4441("o\u0011\nR2\u001ew|R;")), method4442(method4441(",H")), method4442(method4441("n\u0016\u0011/%\u0017lu_8\u0016r")), method4442(method4441("V0*\u0007s\u000b#0\u000bbC,1\u0016iG6 E*")), method4442(method4441("\u0006\n\u0011+Z\tskO\u0000")), method4442(method4441("\u0006\n\u0011+Z\tskO\u0000,")), method4442(method4441("n\u0016\u0011/%\u0017lu_>\u0016u")), method4442(method4441("L#3\u001e$H'1Q_t\u000e")), method4442(method4441("\u001cb")), method4442(method4441("U7+QdC6k\b}Ql5\reR-&\u0010f\b*1\u000bz\b\u00030\u000bbC,1\u0016iG6,\u0010do,#\u0010")), method4442(method4441("U75\u000feT66/xC'(\u000f~O4 >\u007fR**\rc\\#1\u0016eH")), method4442(method4441("A'17oG& \rDG/ ")), method4442(method4441("L#3\u001e$J#+\u0018$u67\u0016dA")), method4442(method4441("A'17oG& \r\\G.0\u001a")), method4442(method4441("N61\u000fy\u001cmj")), method4442(method4441("A'1/xI:<>\u007fR*"))};
   @OriginalMember(
      owner = "client!kha",
      name = "f",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field8927;
   @OriginalMember(
      owner = "client!kha",
      name = "g",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field8928;

   @OriginalMember(
      owner = "client!kha",
      name = "httpProxyConnect",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;)Ljava/net/Socket;",
      line = 13
   )
   private final Socket httpProxyConnect(String arg0, int arg1, String arg2) throws IOException {
      Socket var4 = new Socket(arg0, arg1);
      var4.setSoTimeout(10000);
      OutputStream var5 = var4.getOutputStream();
      if (arg2 != null) {
         var5.write((field8929[7] + this.field10475 + ":" + this.field10477 + field8929[12] + arg2 + field8929[9]).getBytes(Charset.forName(field8929[8])));
      } else {
         var5.write((field8929[7] + this.field10475 + ":" + this.field10477 + field8929[13]).getBytes(Charset.forName(field8929[8])));
      }

      var5.flush();
      BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.getInputStream()));
      String var7 = var6.readLine();
      if (var7 != null) {
         if (var7.startsWith(field8929[10]) || var7.startsWith(field8929[5])) {
            return var4;
         }

         if (var7.startsWith(field8929[14]) || var7.startsWith(field8929[6])) {
            int var8 = 0;
            String var9 = field8929[11];

            for(String var10 = var6.readLine(); var10 != null && var8 < 50; var10 = var6.readLine()) {
               if (var10.toLowerCase().startsWith(var9)) {
                  String var11 = var10.substring(var9.length()).trim();
                  int var12 = var11.indexOf(32);
                  if (~var12 != 0) {
                     var11 = var11.substring(0, var12);
                  }

                  throw new class345(var11);
               }

               ++var8;
            }

            throw new class345("");
         }
      }

      var5.close();
      var6.close();
      var4.close();
      return null;
   }

   @OriginalMember(
      owner = "client!kha",
      name = "b",
      descriptor = "(I)Ljava/net/Socket;",
      line = 87
   )
   public final Socket method3850(int arg0) throws IOException {
      boolean var2 = Boolean.parseBoolean(System.getProperty(field8929[4]));
      if (!var2) {
         System.setProperty(field8929[4], field8929[3]);
      }

      int var3 = 67 / ((-50 - arg0) / 45);
      boolean var4 = ~this.field10477 == -444;

      List var5;
      List var6;
      try {
         var5 = this.field8926.select(new URI((var4 ? field8929[0] : field8929[2]) + field8929[1] + this.field10475));
         var6 = this.field8926.select(new URI((!var4 ? field8929[0] : field8929[2]) + field8929[1] + this.field10475));
      } catch (URISyntaxException var19) {
         return this.method5063(3);
      }

      var5.addAll(var6);
      Object[] var8 = var5.toArray();
      class345 var9 = null;
      Object[] var10 = var8;

      for(int var11 = 0; var10.length > var11; ++var11) {
         Object var12 = var10[var11];
         Proxy var13 = (Proxy)var12;

         try {
            Socket var14 = this.method4439(var13, 14073);
            if (var14 != null) {
               return var14;
            }
         } catch (class345 var17) {
            var9 = var17;
         } catch (IOException var18) {
         }
      }

      if (var9 == null) {
         return this.method5063(3);
      } else {
         throw var9;
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(Ljava/net/Proxy;I)Ljava/net/Socket;",
      line = 156
   )
   private final Socket method4439(Proxy arg0, int arg1) throws IOException {
      if (arg0.type() == Type.DIRECT) {
         return this.method5063(3);
      } else {
         SocketAddress var3 = arg0.address();
         if (var3 instanceof InetSocketAddress) {
            if (arg1 != 14073) {
               return (Socket)null;
            } else {
               InetSocketAddress var4 = (InetSocketAddress)var3;
               if (arg0.type() == Type.HTTP) {
                  String var5 = null;

                  try {
                     Class var6 = Class.forName(field8929[17]);
                     Method var7 = var6.getDeclaredMethod(field8929[23], field8927 == null ? (field8927 = method4440(field8929[20])) : field8927, Integer.TYPE);
                     var7.setAccessible(true);
                     Object var8 = var7.invoke((Object)null, var4.getHostName(), new Integer(var4.getPort()));
                     if (var8 != null) {
                        Method var9 = var6.getDeclaredMethod(field8929[18]);
                        var9.setAccessible(true);
                        if ((Boolean)var9.invoke(var8)) {
                           Method var10 = var6.getDeclaredMethod(field8929[19]);
                           var10.setAccessible(true);
                           Method var11 = var6.getDeclaredMethod(field8929[21], field8928 == null ? (field8928 = method4440(field8929[15])) : field8928, field8927 == null ? (field8927 = method4440(field8929[20])) : field8927);
                           var11.setAccessible(true);
                           String var12 = (String)var10.invoke(var8);
                           String var13 = (String)var11.invoke(var8, new URL(field8929[22] + this.field10475 + "/"), field8929[0]);
                           var5 = var12 + field8929[16] + var13;
                        }
                     }
                  } catch (Exception var16) {
                  }

                  return this.httpProxyConnect(var4.getHostName(), var4.getPort(), var5);
               } else if (arg0.type() == Type.SOCKS) {
                  Socket var15 = new Socket(arg0);
                  var15.connect(new InetSocketAddress(this.field10475, this.field10477));
                  return var15;
               } else {
                  return null;
               }
            }
         } else {
            return null;
         }
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 180
   )
   public static Class method4440(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw (new NoClassDefFoundError()).initCause(var2);
      }
   }

   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4441(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 10);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4442(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 10;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
