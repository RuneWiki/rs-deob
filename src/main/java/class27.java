import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class27 extends class391 {
   @OriginalMember(
      owner = "client!vs",
      name = "l",
      descriptor = "I"
   )
   public int field330;
   @OriginalMember(
      owner = "client!vs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field331 = new String[]{method197(method196("e\"r8\u0015")), method197(method196("e\"r;\u0015")), method197(method196("e\"rFT}8(D\u0015"))};
   @OriginalMember(
      owner = "client!vs",
      name = "o",
      descriptor = "[S"
   )
   private static short[] field326 = new short[]{6798, 8741, 25238, 4626, 4550};
   @OriginalMember(
      owner = "client!vs",
      name = "p",
      descriptor = "[S"
   )
   private static short[] field325 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!vs",
      name = "q",
      descriptor = "[S"
   )
   private static short[] field329 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!vs",
      name = "m",
      descriptor = "[[S"
   )
   public static short[][] field323 = new short[][]{field326, field325, field329};
   @OriginalMember(
      owner = "client!vs",
      name = "n",
      descriptor = "I"
   )
   public static int field327;
   @OriginalMember(
      owner = "client!vs",
      name = "k",
      descriptor = "I"
   )
   public static int field328;
   @OriginalMember(
      owner = "client!vs",
      name = "r",
      descriptor = "Lrr;"
   )
   public static class678 field324;

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method194(int arg0, byte arg1) {
      try {
         ++field327;
         int var2 = -class576.field8516 + class308.field4801;
         if (~var2 <= -101) {
            class572.field8464 = -1;
            class697.field10346 = -1;
            class648.field9340 = 1;
         } else {
            int var3 = (int)class357.field5520;
            if (var3 < class243.field3685 >> 8) {
               var3 = class243.field3685 >> 8;
            }

            if (class514.field7831[4] && ~(class294.field4661[4] + 128) < ~var3) {
               var3 = class294.field4661[4] + 128;
            }

            if (arg1 <= 99) {
               field328 = -112;
            }

            float var5;
            int var6;
            label33: {
               int var4 = 16383 & (int)class417.field6456 - -class37.field454;
               class355.method2906(var4, arg0, (var3 >> 3) * 3 + 600 << 2, (byte)96, class149.field2262, class674.field10031, -200 + class477.method3711(class464.field7054, class476.field7251.field1505, (byte)0, class476.field7251.field1494), var3);
               var5 = -((float)((100 - var2) * (-var2 + 100) * (100 - var2)) / 1000000.0F) + 1.0F;
               class691.field10259 = (int)((float)(-class351.field5352 + class691.field10259) * var5 + (float)class351.field5352);
               class703.field10589 = (int)((float)(-class89.field1281 + class703.field10589) * var5 + (float)class89.field1281);
               class401.field6288 = (int)((float)(-class179.field2785 + class401.field6288) * var5 + (float)class179.field2785);
               class653.field9780 = (int)((float)(-class321.field4919 + class653.field9780) * var5 + (float)class321.field4919);
               var6 = -class294.field4652 + class317.field4895;
               if (var6 <= 8192) {
                  if (var6 >= -8192) {
                     break label33;
                  }

                  var6 += 16384;
                  if (!client.field1786) {
                     break label33;
                  }
               }

               var6 -= 16384;
            }

            class317.field4895 = (int)((float)var6 * var5 + (float)class294.field4652);
            class317.field4895 &= 16383;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field331[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method195(int arg0) {
      try {
         field326 = null;
         field323 = null;
         if (arg0 != -7493) {
            field326 = null;
         }

         field324 = null;
         field325 = null;
         field329 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field331[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class27(int arg0) {
      try {
         this.field330 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field331[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method196(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method197(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 122;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
