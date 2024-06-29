import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class87 {
   @OriginalMember(
      owner = "client!haa",
      name = "g",
      descriptor = "[I"
   )
   private int[] field1049;
   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1064 = new String[]{method806(method805("\u001eE\u0002i|^")), method806(method805("\r\nMi@")), method806(method805("\u001eE\u0002iy^")), method806(method805("\u0018Q\u000f+")), method806(method805("\u001eE\u0002i\u007f^")), method806(method805("\u001eE\u0002i~^")), method806(method805("\u001eE\u0002i\u0001\u001fJ\n3\u0003^"))};
   @OriginalMember(
      owner = "client!haa",
      name = "m",
      descriptor = "Lsd;"
   )
   public static class101 field1050 = new class101(59, 0);
   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "[[S"
   )
   private static short[][] field1053 = new short[][]{{6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}, {4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545}};
   @OriginalMember(
      owner = "client!haa",
      name = "i",
      descriptor = "[[S"
   )
   private static short[][] field1055 = new short[][]{new short[0], new short[0], new short[0], new short[0], new short[0]};
   @OriginalMember(
      owner = "client!haa",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field1056 = false;
   @OriginalMember(
      owner = "client!haa",
      name = "n",
      descriptor = "[[S"
   )
   private static short[][] field1054 = new short[][]{new short[0], new short[0], new short[0], new short[0], new short[0]};
   @OriginalMember(
      owner = "client!haa",
      name = "k",
      descriptor = "[[[S"
   )
   public static short[][][] field1061 = new short[][][]{field1053, field1055, field1054};
   @OriginalMember(
      owner = "client!haa",
      name = "o",
      descriptor = "I"
   )
   public static int field1060 = 0;
   @OriginalMember(
      owner = "client!haa",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field1062 = true;
   @OriginalMember(
      owner = "client!haa",
      name = "p",
      descriptor = "[Lut;"
   )
   public static class134[] field1063 = new class134[4];
   @OriginalMember(
      owner = "client!haa",
      name = "h",
      descriptor = "I"
   )
   public static int field1048;
   @OriginalMember(
      owner = "client!haa",
      name = "j",
      descriptor = "I"
   )
   public static int field1052;
   @OriginalMember(
      owner = "client!haa",
      name = "l",
      descriptor = "I"
   )
   public static int field1057;
   @OriginalMember(
      owner = "client!haa",
      name = "e",
      descriptor = "I"
   )
   public static int field1058;
   @OriginalMember(
      owner = "client!haa",
      name = "c",
      descriptor = "I"
   )
   public static int field1059;
   @OriginalMember(
      owner = "client!haa",
      name = "f",
      descriptor = "[Lgl;"
   )
   public static class625[] field1051;

   @OriginalMember(
      owner = "client!haa",
      name = "<init>",
      descriptor = "([I)V",
      line = 4
   )
   public class87(int[] arg0) {
      int var2 = client.field4530;
      super();

      try {
         int var3 = 1;
         if (var2 != 0) {
            var3 <<= 1;
         }

         while(true) {
            while(~((arg0.length >> 1) + arg0.length) <= ~var3) {
               var3 <<= 1;
            }

            this.field1049 = new int[var3 - -var3];
            if (var2 == 0) {
               int var4 = 0;
               if (var2 != 0) {
                  this.field1049[var4] = -1;
                  ++var4;
               }

               while(true) {
                  while(~var4 > ~(var3 + var3)) {
                     this.field1049[var4] = -1;
                     ++var4;
                  }

                  int var5 = 0;
                  if (var2 == 0) {
                     if (var2 == 0 && ~var5 <= ~arg0.length) {
                        return;
                     }

                     do {
                        int var6 = arg0[var5] & var3 + -1;
                        if (var2 != 0) {
                           var6 = var3 + -1 & var6 - -1;
                        }

                        while(~this.field1049[var6 + 1 + var6] != 0) {
                           var6 = var3 + -1 & var6 - -1;
                        }

                        this.field1049[var6 - -var6] = arg0[var5];
                        this.field1049[var6 + 1 - -var6] = var5++;
                     } while(~var5 > ~arg0.length);

                     return;
                  }

                  ++var4;
               }
            }

            var3 = 0;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field1064[6] + (arg0 != null ? field1064[1] : field1064[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(BI)I",
      line = 41
   )
   public final int method801(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field1057;
         int var4 = (this.field1049.length >> 1) + -1;
         int var5 = var4 & arg1;
         if (arg0 < 28) {
            return 30;
         } else {
            while(true) {
               int var6 = this.field1049[var5 - (-var5 - 1)];
               int var10000;
               if (~var6 == 0) {
                  var10000 = -1;
                  if (var3 == 0) {
                     return -1;
                  }
               } else {
                  var10000 = ~arg1;
               }

               if (var10000 == ~this.field1049[var5 + var5]) {
                  return var6;
               }

               var5 = var5 + 1 & var4;
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field1064[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(I)V",
      line = 74
   )
   public static final void method802(int arg0) {
      try {
         ++field1048;
         if (arg0 == -3545) {
            class748 var1 = class413.field6322;
            synchronized(class413.field6322) {
               class413.field6322.method5451(2);
            }
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1064[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "a",
      descriptor = "(BLha;)V",
      line = 89
   )
   public static final void method803(byte arg0, class66 arg1) {
      try {
         label27: {
            if (class750.field11111) {
               class81.method757((byte)71, arg1);
               if (client.field4530 == 0) {
                  break label27;
               }
            }

            class440.method3323(arg1, -29550);
         }

         ++field1052;
         if (arg0 != -20) {
            method803((byte)54, (class66)null);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1064[2] + arg0 + ',' + (arg1 != null ? field1064[1] : field1064[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "b",
      descriptor = "(I)V",
      line = 110
   )
   public static void method804(int arg0) {
      try {
         if (arg0 >= 1) {
            field1050 = null;
            field1054 = null;
            field1053 = null;
            field1051 = null;
            field1063 = null;
            field1055 = null;
            field1061 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1064[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method805(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!haa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method806(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 36;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
