import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class685 extends class629 {
   @OriginalMember(
      owner = "client!sv",
      name = "M",
      descriptor = "I"
   )
   private int field10075 = 0;
   @OriginalMember(
      owner = "client!sv",
      name = "H",
      descriptor = "I"
   )
   private int field10073 = 0;
   @OriginalMember(
      owner = "client!sv",
      name = "F",
      descriptor = "I"
   )
   private int field10076 = 1;
   @OriginalMember(
      owner = "client!sv",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10083 = new String[]{method4996(method4995("a7I.A")), method4996(method4995("a7I-A")), method4996(method4995("a7I*A")), method4996(method4995("a7I)A")), method4996(method4995("a7I%A")), method4996(method4995("|4\u000b\f")), method4996(method4995("ioIN\u0014"))};
   @OriginalMember(
      owner = "client!sv",
      name = "G",
      descriptor = "[C"
   )
   public static char[] field10078 = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
   @OriginalMember(
      owner = "client!sv",
      name = "I",
      descriptor = "Liw;"
   )
   public static class332 field10080 = new class332();
   @OriginalMember(
      owner = "client!sv",
      name = "N",
      descriptor = "[I"
   )
   public static int[] field10081 = new int[2];
   @OriginalMember(
      owner = "client!sv",
      name = "K",
      descriptor = "[Ljava/awt/Color;"
   )
   public static Color[] field10082 = new Color[]{new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381)};
   @OriginalMember(
      owner = "client!sv",
      name = "D",
      descriptor = "I"
   )
   public static int field10072;
   @OriginalMember(
      owner = "client!sv",
      name = "J",
      descriptor = "I"
   )
   public static int field10074;
   @OriginalMember(
      owner = "client!sv",
      name = "E",
      descriptor = "I"
   )
   public static int field10077;
   @OriginalMember(
      owner = "client!sv",
      name = "L",
      descriptor = "I"
   )
   public static int field10079;

   @OriginalMember(
      owner = "client!sv",
      name = "<init>",
      descriptor = "()V",
      line = 4
   )
   public class685() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!sv",
      name = "g",
      descriptor = "(I)Z",
      line = 7
   )
   public static final boolean method4993(int arg0) {
      try {
         if (arg0 >= -42) {
            method4993(71);
         }

         ++field10074;
         return ~class203.field3034 != -1;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10083[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "b",
      descriptor = "(B)V",
      line = 18
   )
   public static void method4994(byte arg0) {
      try {
         field10082 = null;
         field10078 = null;
         field10080 = null;
         int var1 = 41 % ((arg0 - 16) / 58);
         field10081 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10083[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "b",
      descriptor = "(I)V",
      line = 30
   )
   public final void method901(int arg0) {
      try {
         class375.method2933(256);
         ++field10072;
         if (arg0 != 245880940) {
            method4994((byte)107);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10083[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 41
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label46: {
            label45: {
               label44: {
                  if (arg2 != 0) {
                     if (~arg2 == -2) {
                        break label44;
                     }

                     if (arg2 != 3) {
                        break label46;
                     }

                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field10073 = arg0.method3564((byte)-98);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field10075 = arg0.method3564((byte)-46);
               if (!var4) {
                  break label46;
               }
            }

            this.field10076 = arg0.method3564((byte)-76);
         }

         if (arg1 != 0) {
            field10078 = null;
         }

         ++field10077;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10083[4] + (arg0 != null ? field10083[6] : field10083[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "b",
      descriptor = "(II)[I",
      line = 83
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field10079;
         if (arg1 != 2048) {
            return null;
         } else {
            int[] var4 = super.field9161.method3870((byte)56, arg0);
            if (super.field9161.field7474) {
               int var5 = class442.field6448[arg0];
               int var6 = var5 + -2048 >> 1;
               int var7 = 0;
               if (var3 || class66.field1214 > var7) {
                  do {
                     int var12;
                     label38: {
                        int var8 = class429.field6201[var7];
                        int var9 = var8 + -2048 >> 1;
                        if (~this.field10073 != -1) {
                           int var10 = var6 * var6 + var9 * var9 >> 12;
                           int var11 = (int)(Math.sqrt((double)((float)var10 / 4096.0F)) * 4096.0D);
                           var12 = (int)((double)(this.field10076 * var11) * 3.141592653589793D);
                           if (!var3) {
                              break label38;
                           }
                        }

                        var12 = (-var5 + var8) * this.field10076;
                     }

                     int var13;
                     label45: {
                        var13 = var12 - (var12 & -4096);
                        if (this.field10075 != 0) {
                           if (~this.field10075 != -3) {
                              break label45;
                           }

                           var13 -= 2048;
                           if (var13 < 0) {
                              var13 = -var13;
                           }

                           var13 = -var13 + 2048 << 1;
                           if (!var3) {
                              break label45;
                           }
                        }

                        var13 = class320.field4618[(4087 & var13) >> 4] - -4096 >> 1;
                     }

                     var4[var7] = var13;
                     ++var7;
                  } while(class66.field1214 > var7);
               }
            }

            return var4;
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field10083[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4995(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4996(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
