import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class631 {
   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "Laea;"
   )
   private class678 field8967;
   @OriginalMember(
      owner = "client!bfa",
      name = "e",
      descriptor = "J"
   )
   public long field8966;
   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8974 = new String[]{method4628(method4627("W\"\u0017pv\u001d")), method4628(method4627("W\"\u0017pt\u001d")), method4628(method4627("W\"\u0017pQ\\*\u00172^O!^")), method4628(method4627("NjXpJ")), method4628(method4627("W\"\u0017p\u000b\\*\u001f*\t\u001d")), method4628(method4627("[1\u001a2")), method4628(method4627("W\"\u0017pu\u001d"))};
   @OriginalMember(
      owner = "client!bfa",
      name = "g",
      descriptor = "Lhha;"
   )
   public static class724 field8970 = new class724(84, 0);
   @OriginalMember(
      owner = "client!bfa",
      name = "f",
      descriptor = "Lhha;"
   )
   public static class724 field8972 = new class724(105, -1);
   @OriginalMember(
      owner = "client!bfa",
      name = "h",
      descriptor = "I"
   )
   public static int field8968;
   @OriginalMember(
      owner = "client!bfa",
      name = "b",
      descriptor = "I"
   )
   public static int field8969;
   @OriginalMember(
      owner = "client!bfa",
      name = "c",
      descriptor = "I"
   )
   public static int field8971;
   @OriginalMember(
      owner = "client!bfa",
      name = "d",
      descriptor = "I"
   )
   public static int field8973;

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(IZ)Z"
   )
   public static final boolean method4623(int arg0, boolean arg1) {
      try {
         if (arg1) {
            method4625((class471)null);
         }

         ++field8969;
         return ~arg0 == -4 || ~arg0 == -5;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8974[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field8971;
         this.field8967.method4896(255, this.field8966);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8974[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(ILbt;B)V"
   )
   public static final void method4624(int arg0, class395 arg1, byte arg2) {
      try {
         if (arg1.field5816 != null) {
            int var3 = arg1.field5816[arg0 - -1];
            if (~arg1.field5831.method2218(false) != ~var3) {
               arg1.field5831.method2215(var3, arg1.field5831.method2214((byte)63), (byte)-111);
               arg1.field5856 = arg1.field5860;
            }
         }

         ++field8968;
         if (arg2 < 52) {
            field8973 = -51;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8974[6] + arg0 + ',' + (arg1 != null ? field8974[3] : field8974[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(Ldea;)V"
   )
   public static final void method4625(class471 arg0) {
      if (arg0 != null) {
         for(int var1 = 0; var1 < 2; ++var1) {
            class471 var2 = null;

            for(class471 var3 = class615.field8739[var1]; var3 != null; var3 = var3.field6823) {
               if (arg0 == var3) {
                  if (var2 != null) {
                     var2.field6823 = var3.field6823;
                  } else {
                     class615.field8739[var1] = var3.field6823;
                  }

                  class248.field3804 = true;
                  return;
               }

               var2 = var3;
            }

            class471 var4 = null;

            for(class471 var5 = class705.field10147[var1]; var5 != null; var5 = var5.field6823) {
               if (arg0 == var5) {
                  if (var4 != null) {
                     var4.field6823 = var5.field6823;
                  } else {
                     class705.field10147[var1] = var5.field6823;
                  }

                  class248.field3804 = true;
                  return;
               }

               var4 = var5;
            }

            class471 var6 = null;

            for(class471 var7 = class399.field5912[var1]; var7 != null; var7 = var7.field6823) {
               if (arg0 == var7) {
                  if (var6 != null) {
                     var6.field6823 = var7.field6823;
                  } else {
                     class399.field5912[var1] = var7.field6823;
                  }

                  class248.field3804 = true;
                  return;
               }

               var6 = var7;
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4626(int arg0) {
      try {
         field8972 = null;
         field8970 = null;
         if (arg0 >= -96) {
            method4624(55, (class395)null, (byte)0);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8974[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "<init>",
      descriptor = "(Laea;JI)V"
   )
   public class631(class678 arg0, long arg1, int arg2) {
      try {
         this.field8967 = arg0;
         this.field8966 = arg1;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8974[4] + (arg0 != null ? field8974[3] : field8974[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4627(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4628(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
