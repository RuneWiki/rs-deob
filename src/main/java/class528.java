import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class528 {
   @OriginalMember(
      owner = "client!hha",
      name = "b",
      descriptor = "I"
   )
   private int field8018 = 0;
   @OriginalMember(
      owner = "client!hha",
      name = "e",
      descriptor = "Let;"
   )
   private class389 field8016;
   @OriginalMember(
      owner = "client!hha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8022 = new String[]{method4062(method4061("p&R\u001eL0")), method4062(method4061("8rP_b%(UVh(~\r")), method4062(method4061("8rP_b%~\u0003Vh ~\r")), method4062(method4061("p&R\u001eM0")), method4062(method4061("8rP_b%(UVh~(\r")), method4062(method4061("$aP_b&")), method4062(method4061("1r\u001cSatp")), method4062(method4061("8f")), method4062(method4061("p&R\u001eO0")), method4062(method4061("c`\u001d\u001es")), method4062(method4061("p&R\u001e2q ZD00")), method4062(method4061("v;_\\")), method4062(method4061("p&R\u001eJ0"))};
   @OriginalMember(
      owner = "client!hha",
      name = "d",
      descriptor = "[[I"
   )
   public static int[][] field8014 = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 1, 1, 7}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 10}, {12, 12, 12, 12}};
   @OriginalMember(
      owner = "client!hha",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field8020 = new int[1];
   @OriginalMember(
      owner = "client!hha",
      name = "f",
      descriptor = "I"
   )
   public static int field8017 = 0;
   @OriginalMember(
      owner = "client!hha",
      name = "g",
      descriptor = "I"
   )
   public static int field8019 = 0;
   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "I"
   )
   public static int field8015 = 0;
   @OriginalMember(
      owner = "client!hha",
      name = "j",
      descriptor = "I"
   )
   public static int field8011;
   @OriginalMember(
      owner = "client!hha",
      name = "c",
      descriptor = "I"
   )
   public static int field8012;
   @OriginalMember(
      owner = "client!hha",
      name = "h",
      descriptor = "I"
   )
   public static int field8021;
   @OriginalMember(
      owner = "client!hha",
      name = "i",
      descriptor = "Lhe;"
   )
   private class294 field8013;

   @OriginalMember(
      owner = "client!hha",
      name = "c",
      descriptor = "(I)Lhe;",
      line = 10
   )
   public final class294 method4057(int arg0) {
      try {
         if (arg0 != 5) {
            return null;
         } else {
            this.field8018 = 0;
            ++field8021;
            return this.method4058(arg0 ^ 112);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8022[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "b",
      descriptor = "(I)Lhe;",
      line = 22
   )
   public final class294 method4058(int arg0) {
      boolean var2 = client.field1786;

      try {
         int var3 = -108 % ((35 - arg0) / 53);
         ++field8012;
         if (this.field8018 > 0 && this.field8016.field6113[this.field8018 - 1] != this.field8013) {
            class294 var4 = this.field8013;
            this.field8013 = var4.field4656;
            return var4;
         } else {
            while(~this.field8016.field6116 < ~this.field8018) {
               class294 var5 = this.field8016.field6113[this.field8018++].field4656;
               class294 var10000 = this.field8016.field6113[this.field8018 - 1];

               while(var10000 != var5) {
                  this.field8013 = var5.field4656;
                  var10000 = var5;
                  if (!var2) {
                     return var5;
                  }
               }
            }

            return null;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field8022[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "(I)V",
      line = 58
   )
   public static void method4059(int arg0) {
      try {
         field8014 = null;
         if (arg0 == 12) {
            field8020 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8022[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "<init>",
      descriptor = "()V",
      line = 73
   )
   public class528() {
   }

   @OriginalMember(
      owner = "client!hha",
      name = "<init>",
      descriptor = "(Let;)V",
      line = 114
   )
   public class528(class389 arg0) {
      try {
         this.field8016 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8022[10] + (arg0 != null ? field8022[9] : field8022[11]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "a",
      descriptor = "(ZI)Ljava/lang/String;",
      line = 86
   )
   public static final String method4060(boolean arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field8011;
         if (arg0) {
            return null;
         } else {
            String var3 = Integer.toString(arg1);
            int var4 = -3 + var3.length();
            if (var2) {
               var3 = var3.substring(0, var4) + "," + var3.substring(var4);
               var4 -= 3;
            }

            while(true) {
               while(~var4 < -1) {
                  var3 = var3.substring(0, var4) + "," + var3.substring(var4);
                  var4 -= 3;
               }

               if (!var2) {
                  if (var3.length() > 9) {
                     return field8022[2] + var3.substring(0, var3.length() - 8) + class499.field7621.method3875(class493.field7455, 83) + field8022[7] + var3 + field8022[6];
                  }

                  if (~var3.length() < -7) {
                     return field8022[4] + var3.substring(0, var3.length() - 4) + class499.field7623.method3875(class493.field7455, 96) + field8022[7] + var3 + field8022[6];
                  }

                  return field8022[1] + var3 + field8022[5];
               }

               var3 = var3;
               var4 -= 3;
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field8022[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4061(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4062(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
