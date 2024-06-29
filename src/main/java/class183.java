import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class183 {
   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2693 = new String[]{method1656(method1655("'v@_\u0013z")), method1656(method1655("'v@_\u0016z")), method1656(method1655("'v@_\u0015z")), method1656(method1655("'v@_\u0014z"))};
   @OriginalMember(
      owner = "client!uea",
      name = "i",
      descriptor = "Lef;"
   )
   public static class171 field2686 = new class171();
   @OriginalMember(
      owner = "client!uea",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field2691 = new int[5];
   @OriginalMember(
      owner = "client!uea",
      name = "k",
      descriptor = "I"
   )
   public static int field2682;
   @OriginalMember(
      owner = "client!uea",
      name = "j",
      descriptor = "I"
   )
   public int field2684;
   @OriginalMember(
      owner = "client!uea",
      name = "c",
      descriptor = "I"
   )
   public static int field2685;
   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "I"
   )
   public static int field2687;
   @OriginalMember(
      owner = "client!uea",
      name = "g",
      descriptor = "I"
   )
   public static int field2692;
   @OriginalMember(
      owner = "client!uea",
      name = "e",
      descriptor = "Lmda;"
   )
   public static class413 field2689;
   @OriginalMember(
      owner = "client!uea",
      name = "f",
      descriptor = "Lclient;"
   )
   public static client field2683;
   @OriginalMember(
      owner = "client!uea",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field2688;
   @OriginalMember(
      owner = "client!uea",
      name = "h",
      descriptor = "[Lwl;"
   )
   public static class532[] field2690;

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1651(int arg0, int arg1) {
      try {
         ++field2687;
         if (class460.field6712 == null || ~arg1 < ~class460.field6712.length) {
            class460.field6712 = new int[arg1];
         }

         int var2 = -61 / ((-30 - arg0) / 40);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2693[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1652(int arg0) {
      try {
         field2690 = null;
         if (arg0 == 19290) {
            field2683 = null;
            field2689 = null;
            field2691 = null;
            field2686 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2693[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(BJ)V"
   )
   public static final void method1653(byte arg0, long arg1) {
      boolean var3 = client.field10022;

      try {
         ++field2682;
         int var4 = class635.field8999 + class117.field1849.field6832;
         int var5 = class117.field1849.field6833 - -class121.field1956;
         if (class779.field11378 - var4 < -2000 || ~(-var4 + class779.field11378) < -2001 || -var5 + class576.field8140 < -2000 || -var5 + class576.field8140 > 2000) {
            class779.field11378 = var4;
            class576.field8140 = var5;
         }

         if (~class779.field11378 != ~var4) {
            int var7;
            label95: {
               int var6 = -class779.field11378 + var4;
               var7 = (int)((long)var6 * arg1 / 320L);
               if (~var6 < -1) {
                  if (~var7 != -1) {
                     if (var7 <= var6) {
                        break label95;
                     }

                     var7 = var6;
                     if (!var3) {
                        break label95;
                     }
                  }

                  var7 = 1;
                  if (!var3) {
                     break label95;
                  }
               }

               if (var7 != 0) {
                  if (var7 >= var6) {
                     break label95;
                  }

                  var7 = var6;
                  if (!var3) {
                     break label95;
                  }
               }

               var7 = -1;
            }

            class779.field11378 += var7;
         }

         class604.field8615 += (float)arg1 * class126.field2033 / 6.0F;
         class86.field1312 += (float)arg1 * class662.field9329 / 6.0F;
         if (class576.field8140 != var5) {
            int var9;
            label96: {
               int var8 = -class576.field8140 + var5;
               var9 = (int)((long)var8 * arg1 / 320L);
               if (~var8 < -1) {
                  if (~var9 == -1) {
                     var9 = 1;
                     if (!var3) {
                        break label96;
                     }
                  }

                  if (var8 >= var9) {
                     break label96;
                  }

                  var9 = var8;
                  if (!var3) {
                     break label96;
                  }
               }

               if (~var9 == -1) {
                  var9 = -1;
                  if (!var3) {
                     break label96;
                  }
               }

               if (~var8 < ~var9) {
                  var9 = var8;
               }
            }

            class576.field8140 += var9;
         }

         class14.method116(true);
         if (arg0 != -8) {
            field2690 = null;
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field2693[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1654(byte arg0) {
      try {
         class8.field147 = new class261();
         ++field2685;
         if (arg0 <= 68) {
            field2690 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2693[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1655(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1656(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
