import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public abstract class class102 {
   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1314 = new String[]{method854(method853("tmIaN8")), method854(method853("tmIaH8")), method854(method853(",lG#1 ?N)< 1")), method854(method853(",lG#1vi\u0018\u007f< 1")), method854(method853(",lG#1vi\u001b\u007f< 1")), method854(method853(",lG#1viJ\u007f< 1")), method854(method853(",lG#1(?N)< 1")), method854(method853(",lG#1vi\u001f\u007f< 1")), method854(method853(",lG#1viN)< 1")), method854(method853(",lG#1$?N)< 1")), method854(method853("tmIaI8")), method854(method853(",lG#1s?N)< 1")), method854(method853("k!\u0006aq")), method854(method853("~zD#")), method854(method853("tmIaM8"))};
   @OriginalMember(
      owner = "client!dba",
      name = "e",
      descriptor = "I"
   )
   public static int field1308 = 0;
   @OriginalMember(
      owner = "client!dba",
      name = "f",
      descriptor = "I"
   )
   public static int field1311 = 0;
   @OriginalMember(
      owner = "client!dba",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field1312 = false;
   @OriginalMember(
      owner = "client!dba",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field1313 = false;
   @OriginalMember(
      owner = "client!dba",
      name = "h",
      descriptor = "Lqca;"
   )
   public static class127 field1305 = new class127(2, 2);
   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "I"
   )
   public static int field1306;
   @OriginalMember(
      owner = "client!dba",
      name = "c",
      descriptor = "I"
   )
   public static int field1307;
   @OriginalMember(
      owner = "client!dba",
      name = "g",
      descriptor = "I"
   )
   public static int field1309;
   @OriginalMember(
      owner = "client!dba",
      name = "d",
      descriptor = "I"
   )
   public static int field1310;

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(ILts;)Lts;"
   )
   public abstract class562 method848(int arg0, class562 arg1);

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method849(boolean arg0) {
      try {
         field1305 = null;
         if (arg0) {
            field1313 = false;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1314[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(Lsga;ILsga;)V"
   )
   public static final void method850(class76 arg0, int arg1, class76 arg2) {
      try {
         if (arg0.field946 != null) {
            arg0.method693((byte)-106);
         }

         ++field1306;
         arg0.field950 = arg2;
         arg0.field946 = arg2.field946;
         arg0.field946.field950 = arg0;
         arg0.field950.field946 = arg0;
         if (arg1 <= 94) {
            field1308 = 109;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1314[14] + (arg0 != null ? field1314[12] : field1314[13]) + ',' + arg1 + ',' + (arg2 != null ? field1314[12] : field1314[13]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(IBII)I"
   )
   public static final int method851(int arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field1307;
         if (arg1 != 127) {
            field1312 = true;
         }

         if (class731.field10698 == null) {
            return 0;
         } else {
            int var4 = arg2 >> 9;
            int var5 = arg3 >> 9;
            if (~var4 <= -1 && var5 >= 0 && class644.field9403 + -1 >= var4 && var5 <= class337.field4594 + -1) {
               int var6 = arg0;
               if (arg0 < 3 && (class613.field9016[1][var4][var5] & 2) != 0) {
                  var6 = arg0 + 1;
               }

               return class731.field10698[var6].method2220(arg3, arg2, 82);
            } else {
               return 0;
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field1314[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(III)Ljava/lang/String;"
   )
   public static final String method852(int arg0, int arg1, int arg2) {
      try {
         ++field1310;
         int var3 = -arg2 + arg1;
         if (~var3 > 8) {
            return field1314[3];
         } else if (var3 < -6) {
            return field1314[4];
         } else if (var3 < -3) {
            return field1314[7];
         } else if (~var3 > -1) {
            return field1314[5];
         } else if (~var3 < -10) {
            return field1314[2];
         } else {
            if (arg0 != 7315) {
               field1309 = 112;
            }

            if (~var3 < -7) {
               return field1314[9];
            } else if (~var3 < -4) {
               return field1314[6];
            } else {
               return ~var3 < -1 ? field1314[11] : field1314[8];
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1314[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method853(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method854(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
