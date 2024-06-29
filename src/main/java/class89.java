import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class89 extends class770 {
   @OriginalMember(
      owner = "client!gv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1143 = new String[]{method852(method851("j8%]h")), method852(method851("j8%^h"))};
   @OriginalMember(
      owner = "client!gv",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field1134 = false;
   @OriginalMember(
      owner = "client!gv",
      name = "f",
      descriptor = "I"
   )
   public static int field1141 = -1;
   @OriginalMember(
      owner = "client!gv",
      name = "j",
      descriptor = "I"
   )
   public int field1133;
   @OriginalMember(
      owner = "client!gv",
      name = "g",
      descriptor = "I"
   )
   public int field1135;
   @OriginalMember(
      owner = "client!gv",
      name = "o",
      descriptor = "I"
   )
   public int field1136;
   @OriginalMember(
      owner = "client!gv",
      name = "n",
      descriptor = "I"
   )
   public int field1137;
   @OriginalMember(
      owner = "client!gv",
      name = "h",
      descriptor = "I"
   )
   public int field1138;
   @OriginalMember(
      owner = "client!gv",
      name = "l",
      descriptor = "I"
   )
   public int field1139;
   @OriginalMember(
      owner = "client!gv",
      name = "i",
      descriptor = "I"
   )
   public static int field1140;
   @OriginalMember(
      owner = "client!gv",
      name = "m",
      descriptor = "I"
   )
   public static int field1142;
   @OriginalMember(
      owner = "client!gv",
      name = "p",
      descriptor = "Ljava/lang/String;"
   )
   public String field1132;

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method849(int arg0) {
      try {
         ++class336.field4815;
         ++field1142;
         class471 var1 = class133.method1118(class605.field8474.field2787, 2, class265.field3448);
         var1.field6527.method4337(class55.field599, 1184007664);
         class605.field8474.method1702((byte)-88, var1);
         if (arg0 <= 66) {
            method850((byte)-73, 114);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1143[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method850(byte arg0, int arg1) {
      try {
         ++field1140;
         int var2 = -class148.field1936 + class369.field5205;
         if (var2 >= 100) {
            class552.field7597 = -1;
            class721.field10567 = -1;
            class635.field8977 = 1;
         } else {
            int var3 = (int)class676.field9918;
            if (~var3 > ~(class524.field7180 >> 8)) {
               var3 = class524.field7180 >> 8;
            }

            if (class205.field2521[4] && ~(class311.field4123[4] - -128) < ~var3) {
               var3 = class311.field4123[4] + 128;
            }

            int var4 = 16383 & (int)class363.field5142 + class719.field10538;
            class254.method1933(var3, (var3 >> 3) * 3 + 600 << 2, arg1, class682.field10004, class109.field1383, -200 + class687.method5016(class278.field3709.field999, class239.field2981, class278.field3709.field1003, 2), var4, 3);
            float var5 = -((float)((-var2 + 100) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F) + 1.0F;
            class737.field10747 = (int)((float)(-class118.field1443 + class737.field10747) * var5 + (float)class118.field1443);
            class171.field2144 = (int)((float)(class171.field2144 - class22.field290) * var5 + (float)class22.field290);
            class331.field4733 = (int)((float)(-class221.field2762 + class331.field4733) * var5 + (float)class221.field2762);
            class532.field7284 = (int)((float)(-class488.field6732 + class532.field7284) * var5 + (float)class488.field6732);
            int var6 = -class118.field1440 + class749.field10899;
            if (arg0 == 48) {
               label33: {
                  if (var6 <= 8192) {
                     if (~var6 <= 8191) {
                        break label33;
                     }

                     var6 += 16384;
                     if (!client.field4273) {
                        break label33;
                     }
                  }

                  var6 -= 16384;
               }

               class749.field10899 = (int)((float)var6 * var5 + (float)class118.field1440);
               class749.field10899 &= 16383;
            }
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field1143[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method851(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method852(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
