import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class299 {
   @OriginalMember(
      owner = "client!uca",
      name = "g",
      descriptor = "Z"
   )
   private boolean field4701;
   @OriginalMember(
      owner = "client!uca",
      name = "c",
      descriptor = "I"
   )
   private int field4696;
   @OriginalMember(
      owner = "client!uca",
      name = "j",
      descriptor = "Z"
   )
   private boolean field4699;
   @OriginalMember(
      owner = "client!uca",
      name = "f",
      descriptor = "I"
   )
   private int field4700;
   @OriginalMember(
      owner = "client!uca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4702 = new String[]{method2512(method2511("U#P\u0017+\b")), method2512(method2511("U#P\u0017VI.XMT\b")), method2512(method2511("U#P\u0017/\b")), method2512(method2511("U#P\u0017.\b")), method2512(method2511("U#P\u0017)\b")), method2512(method2511("U#P\u0017(\b")), method2512(method2511("U#P\u0017,\b"))};
   @OriginalMember(
      owner = "client!uca",
      name = "e",
      descriptor = "I"
   )
   public static int field4692;
   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "I"
   )
   public static int field4693;
   @OriginalMember(
      owner = "client!uca",
      name = "i",
      descriptor = "I"
   )
   public static int field4694;
   @OriginalMember(
      owner = "client!uca",
      name = "d",
      descriptor = "I"
   )
   public static int field4695;
   @OriginalMember(
      owner = "client!uca",
      name = "h",
      descriptor = "I"
   )
   public static int field4697;
   @OriginalMember(
      owner = "client!uca",
      name = "b",
      descriptor = "I"
   )
   public static int field4698;

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method2505(int arg0, int arg1) {
      try {
         ++field4693;
         class332 var2 = (class332)class570.field8426.method3141((long)arg1, true);
         if (var2 != null) {
            var2.field5035.method4082(4);
            class781.method5679(false, var2.field5033, var2.field5031);
            var2.method2477(1976);
         }

         if (arg0 <= 12) {
            method2505(99, 99);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field4702[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "(IIZII)Z"
   )
   public static final boolean method2506(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
      try {
         ++field4697;
         if (class439.field6716 && class665.field9966) {
            if (~class84.field1223 > -101) {
               return false;
            } else if (!client.method1174(arg3, arg4, arg1, 57)) {
               return false;
            } else if (arg2) {
               return false;
            } else {
               int var5 = arg1 << class394.field6180;
               int var6 = arg3 << class394.field6180;
               if (class404.method3248(arg0, class678.field10091, var6, var5, 0, class385.field6076[arg4].method2313(-121, arg1, arg3), class678.field10091)) {
                  ++class467.field7105;
                  return true;
               } else {
                  return false;
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field4702[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method2507(byte arg0) {
      try {
         if (arg0 != -128) {
            this.field4696 = -77;
         }

         ++field4694;
         return this.field4699;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4702[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method2508(int arg0) {
      try {
         ++field4698;
         return arg0 != -7895 ? 89 : this.field4700;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4702[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method2509(int arg0) {
      try {
         if (arg0 > -65) {
            method2506(-103, -96, false, 95, -109);
         }

         ++field4695;
         return this.field4696;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4702[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method2510(int arg0) {
      try {
         ++field4692;
         return arg0 > -5 ? false : this.field4701;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4702[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "<init>",
      descriptor = "(ZIIZ)V"
   )
   public class299(boolean arg0, int arg1, int arg2, boolean arg3) {
      try {
         this.field4701 = arg0;
         this.field4696 = arg2;
         this.field4699 = arg3;
         this.field4700 = arg1;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field4702[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2511(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2512(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
