import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class138 {
   @OriginalMember(
      owner = "client!sfa",
      name = "f",
      descriptor = "Z"
   )
   public boolean field2214;
   @OriginalMember(
      owner = "client!sfa",
      name = "g",
      descriptor = "I"
   )
   public int field2223;
   @OriginalMember(
      owner = "client!sfa",
      name = "l",
      descriptor = "I"
   )
   public int field2222;
   @OriginalMember(
      owner = "client!sfa",
      name = "b",
      descriptor = "S"
   )
   public short field2218;
   @OriginalMember(
      owner = "client!sfa",
      name = "j",
      descriptor = "S"
   )
   public short field2217;
   @OriginalMember(
      owner = "client!sfa",
      name = "i",
      descriptor = "S"
   )
   public short field2212;
   @OriginalMember(
      owner = "client!sfa",
      name = "c",
      descriptor = "B"
   )
   public byte field2220;
   @OriginalMember(
      owner = "client!sfa",
      name = "h",
      descriptor = "I"
   )
   public int field2219;
   @OriginalMember(
      owner = "client!sfa",
      name = "d",
      descriptor = "I"
   )
   public int field2213;
   @OriginalMember(
      owner = "client!sfa",
      name = "e",
      descriptor = "I"
   )
   public int field2221;
   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2225 = new String[]{method1395(method1394("Xdn\r\u000b\u0003")), method1395(method1394("Xdn\r\b\u0003")), method1395(method1394("Xdn\rvBlfWt\u0003"))};
   @OriginalMember(
      owner = "client!sfa",
      name = "k",
      descriptor = "Ljga;"
   )
   public static class91 field2224 = null;
   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "I"
   )
   public static int field2216;
   @OriginalMember(
      owner = "client!sfa",
      name = "m",
      descriptor = "Lnf;"
   )
   public static class773 field2215;

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method1392(int arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         ++field2216;
         if (arg0 != -14646) {
            field2215 = null;
         }

         class272 var3 = (class272)class594.field8377.method2245((byte)-94);
         boolean var10000;
         if (var2) {
            var10000 = class220.method1904(0, var3.field4159);
         } else if (var3 == null) {
            var10000 = false;
            if (!var2) {
               return false;
            }
         } else {
            var10000 = class220.method1904(0, var3.field4159);
         }

         while(!var10000 || ~((long)arg1) != ~var3.field4166) {
            var3 = (class272)class594.field8377.method2239((byte)125);
            if (var3 == null) {
               var10000 = false;
               if (!var2) {
                  return false;
               }
            } else {
               var10000 = class220.method1904(0, var3.field4159);
            }
         }

         return true;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2225[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1393(int arg0) {
      try {
         field2224 = null;
         if (arg0 != -28481) {
            method1392(83, -3);
         }

         field2215 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2225[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "<init>",
      descriptor = "(IIIIIIIIIZZI)V"
   )
   public class138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
      try {
         this.field2214 = arg10;
         this.field2223 = arg11;
         this.field2222 = arg3;
         this.field2218 = (short)arg4;
         this.field2217 = (short)arg6;
         this.field2212 = (short)arg5;
         this.field2220 = (byte)arg8;
         this.field2219 = arg0;
         this.field2213 = arg2;
         this.field2221 = arg1;
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field2225[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1394(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1395(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
