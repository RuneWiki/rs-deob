import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class510 extends class554 {
   @OriginalMember(
      owner = "client!bi",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7070 = new String[]{method3709(method3708("\u0002\u0001,dn")), method3709(method3708("\u0002\u0001,bn")), method3709(method3708("\u0002\u0001,gn")), method3709(method3708("\u0002\u0001,an")), method3709(method3708("\u0002\u0001,cn")), method3709(method3708("\u001bF,\u000e;")), method3709(method3708("\u000e\u001dnL")), method3709(method3708("\u0002\u0001,en")), method3709(method3708("\u0002\u0001,fn"))};
   @OriginalMember(
      owner = "client!bi",
      name = "x",
      descriptor = "I"
   )
   public static int field7061 = 16777215;
   @OriginalMember(
      owner = "client!bi",
      name = "q",
      descriptor = "F"
   )
   public static float field7056;
   @OriginalMember(
      owner = "client!bi",
      name = "t",
      descriptor = "I"
   )
   public int field7055;
   @OriginalMember(
      owner = "client!bi",
      name = "w",
      descriptor = "I"
   )
   public static int field7057;
   @OriginalMember(
      owner = "client!bi",
      name = "C",
      descriptor = "I"
   )
   public int field7058;
   @OriginalMember(
      owner = "client!bi",
      name = "p",
      descriptor = "I"
   )
   public static int field7059;
   @OriginalMember(
      owner = "client!bi",
      name = "z",
      descriptor = "I"
   )
   public static int field7060;
   @OriginalMember(
      owner = "client!bi",
      name = "n",
      descriptor = "I"
   )
   public static int field7062;
   @OriginalMember(
      owner = "client!bi",
      name = "r",
      descriptor = "I"
   )
   public static int field7064;
   @OriginalMember(
      owner = "client!bi",
      name = "u",
      descriptor = "I"
   )
   public int field7065;
   @OriginalMember(
      owner = "client!bi",
      name = "v",
      descriptor = "I"
   )
   public int field7066;
   @OriginalMember(
      owner = "client!bi",
      name = "B",
      descriptor = "I"
   )
   public static int field7067;
   @OriginalMember(
      owner = "client!bi",
      name = "y",
      descriptor = "I"
   )
   public static int field7068;
   @OriginalMember(
      owner = "client!bi",
      name = "s",
      descriptor = "I"
   )
   public static int field7069;
   @OriginalMember(
      owner = "client!bi",
      name = "o",
      descriptor = "J"
   )
   public long field7063;

   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "(Luk;B)I"
   )
   public static final int method3701(class273 arg0, byte arg1) {
      try {
         ++field7067;
         int var2 = 78 % ((arg1 - 51) / 39);
         if (class426.field5960 != arg0) {
            if (class219.field2733 != arg0) {
               if (class585.field8030 == arg0) {
                  return 34066;
               } else {
                  throw new IllegalArgumentException();
               }
            } else {
               return 34065;
            }
         } else {
            return 9216;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field7070[7] + (arg0 != null ? field7070[5] : field7070[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "b",
      descriptor = "(B)J"
   )
   public final long method3702(byte arg0) {
      try {
         ++field7062;
         return arg0 != -54 ? 32L : this.field7063;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7070[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method3703(byte arg0) {
      try {
         ++field7069;
         if (class282.field3764 != null) {
            if (arg0 != 79) {
               field7056 = 0.18835191F;
            }

            class444.field6156 = new class778();
            class444.field6156.method5572(class637.field9003, class282.field3764.field5919, class282.field3764, true, class282.field3764.field5909.method3980(class494.field6787, true));
            class353.field5045 = new Thread(class444.field6156, "");
            class353.field5045.start();
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7070[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method3704(int arg0) {
      try {
         if (arg0 != 3) {
            field7064 = 50;
         }

         ++field7060;
         return this.field7055;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7070[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "b",
      descriptor = "(Z)I"
   )
   public final int method3705(boolean arg0) {
      try {
         ++field7059;
         if (!arg0) {
            this.field7066 = 34;
         }

         return this.field7065;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7070[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3706(int arg0) {
      try {
         if (arg0 != -7560) {
            return -101;
         } else {
            ++field7057;
            return this.field7066;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7070[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method3707(byte arg0) {
      try {
         ++field7068;
         if (arg0 >= -51) {
            this.field7065 = -125;
         }

         return this.field7058;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7070[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3708(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3709(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
