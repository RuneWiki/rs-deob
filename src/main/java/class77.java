import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class77 extends class557 {
   @OriginalMember(
      owner = "client!nba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1241 = new String[]{method851(method850("\f(\u001epJJ")), method851(method850("\f(\u001epNJ")), method851(method850("\f(\u001epKJ")), method851(method850("\f(\u001ep@J")), method851(method850("\f(\u001epOJ")), method851(method850("\f(\u001epLJ")), method851(method850("\f(\u001epBJ")), method851(method850("\f(\u001epIJ"))};
   @OriginalMember(
      owner = "client!nba",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field1234 = new int[32];
   @OriginalMember(
      owner = "client!nba",
      name = "j",
      descriptor = "Lhj;"
   )
   public static class670 field1238 = new class670();
   @OriginalMember(
      owner = "client!nba",
      name = "i",
      descriptor = "I"
   )
   public static int field1230;
   @OriginalMember(
      owner = "client!nba",
      name = "n",
      descriptor = "I"
   )
   public static int field1231;
   @OriginalMember(
      owner = "client!nba",
      name = "k",
      descriptor = "I"
   )
   public static int field1232;
   @OriginalMember(
      owner = "client!nba",
      name = "h",
      descriptor = "I"
   )
   public static int field1233;
   @OriginalMember(
      owner = "client!nba",
      name = "m",
      descriptor = "I"
   )
   public static int field1235;
   @OriginalMember(
      owner = "client!nba",
      name = "q",
      descriptor = "I"
   )
   public static int field1236;
   @OriginalMember(
      owner = "client!nba",
      name = "r",
      descriptor = "I"
   )
   public static int field1237;
   @OriginalMember(
      owner = "client!nba",
      name = "o",
      descriptor = "I"
   )
   public static int field1239;
   @OriginalMember(
      owner = "client!nba",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field1240;

   @OriginalMember(
      owner = "client!nba",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method846(byte arg0) {
      try {
         ++field1231;
         if (arg0 != 108) {
            return false;
         } else if (super.field7906.method4710(-125)) {
            return false;
         } else {
            return super.field7906.method4715((byte)-107) == class648.field9162;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1241[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         if (arg0 != 1) {
            this.method99(120, false);
         }

         ++field1230;
         if (super.field7906.method4710(-122)) {
            return 3;
         } else {
            return super.field7906.method4715((byte)-107) == class648.field9162 ? 1 : 3;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1241[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         if (arg0 == -22) {
            label30: {
               if (super.field7906.method4715((byte)-107) == class648.field9162) {
                  if (!super.field7906.method4710(arg0 ^ 107)) {
                     break label30;
                  }

                  super.field7905 = 0;
                  if (!client.field10022) {
                     break label30;
                  }
               }

               super.field7905 = 1;
            }

            ++field1232;
            if (~super.field7905 != -1 && ~super.field7905 != -2) {
               super.field7905 = this.method97(0);
            }
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1241[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.method99(25, true);
         }

         ++field1235;
         super.field7905 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1241[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class77(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!nba",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method847(int arg0) {
      try {
         if (arg0 > -52) {
            return -74;
         } else {
            ++field1239;
            return super.field7905;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1241[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class77(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!nba",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method848(byte arg0) {
      try {
         int var1 = 100 / ((arg0 - 3) / 54);
         field1234 = null;
         field1238 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1241[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "b",
      descriptor = "(II)Z"
   )
   public static final boolean method849(int arg0, int arg1) {
      try {
         ++field1236;
         if (~arg1 != -31 && ~arg1 != -58 && arg1 != 59 && ~arg1 != -46 && ~arg1 != -1003 && arg1 != 1001) {
            if (~arg1 == -50) {
               return true;
            } else {
               return arg0 < 109 ? false : false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1241[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         ++field1233;
         if (arg0 != 0) {
            this.method99(95, false);
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1241[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method850(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method851(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
