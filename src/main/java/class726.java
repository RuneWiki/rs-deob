import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class726 extends class213 {
   @OriginalMember(
      owner = "client!jha",
      name = "K",
      descriptor = "I"
   )
   private int field10632 = 4096;
   @OriginalMember(
      owner = "client!jha",
      name = "E",
      descriptor = "I"
   )
   private int field10636 = 4096;
   @OriginalMember(
      owner = "client!jha",
      name = "J",
      descriptor = "I"
   )
   private int field10634 = 4096;
   @OriginalMember(
      owner = "client!jha",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10638 = new String[]{method5286(method5285("\u00013YxAC")), method5286(method5285("\u00013YxIC")), method5286(method5285("\u00013YxLC")), method5286(method5285("\u0005.T:")), method5286(method5285("\u0010u\u0016xv")), method5286(method5285("\u00013YxNC")), method5286(method5285("\u00013YxHC"))};
   @OriginalMember(
      owner = "client!jha",
      name = "F",
      descriptor = "Leb;"
   )
   public static class657 field10630 = null;
   @OriginalMember(
      owner = "client!jha",
      name = "D",
      descriptor = "Ldd;"
   )
   public static class735 field10635 = new class735(2, 4, 4, 0);
   @OriginalMember(
      owner = "client!jha",
      name = "G",
      descriptor = "I"
   )
   public static int field10629;
   @OriginalMember(
      owner = "client!jha",
      name = "H",
      descriptor = "I"
   )
   public static int field10631;
   @OriginalMember(
      owner = "client!jha",
      name = "I",
      descriptor = "I"
   )
   public static int field10633;
   @OriginalMember(
      owner = "client!jha",
      name = "L",
      descriptor = "I"
   )
   public static int field10637;

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field10633;
         int[][] var4 = super.field2644.method3543(-2, arg0);
         if (arg1 <= 26) {
            return null;
         } else {
            if (super.field2644.field6719) {
               int[][] var5 = this.method1615(true, arg0, 0);
               int[] var6 = var5[0];
               int[] var7 = var5[1];
               int[] var8 = var5[2];
               int[] var9 = var4[0];
               int[] var10 = var4[1];
               int[] var11 = var4[2];
               int var12 = 0;
               if (var3 || var12 < class576.field7916) {
                  do {
                     int var13 = var6[var12];
                     int var14 = var8[var12];
                     int var15 = var7[var12];
                     if (~var13 != ~var14 || ~var14 != ~var15) {
                        var9[var12] = this.field10634;
                        var10[var12] = this.field10632;
                        var11[var12] = this.field10636;
                        if (!var3) {
                           ++var12;
                           continue;
                        }
                     }

                     var9[var12] = this.field10634 * var13 >> 12;
                     var10[var12] = this.field10632 * var14 >> 12;
                     var11[var12] = this.field10636 * var15 >> 12;
                     ++var12;
                  } while(var12 < class576.field7916);
               }
            }

            return var4;
         }
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field10638[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "g",
      descriptor = "(I)[I"
   )
   public static final int[] method5281(int arg0) {
      try {
         if (arg0 != -32014) {
            return null;
         } else {
            ++field10631;
            return new int[]{class465.field6382, class167.field2112, class18.field245};
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10638[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label42: {
            label41: {
               label40: {
                  int var5 = 60 / ((arg1 - 68) / 48);
                  if (~arg2 != -1) {
                     if (~arg2 == -2) {
                        break label40;
                     }

                     if (arg2 != 2) {
                        break label42;
                     }

                     if (!var4) {
                        break label41;
                     }
                  }

                  this.field10634 = arg0.method4280(-19104);
                  if (!var4) {
                     break label42;
                  }
               }

               this.field10632 = arg0.method4280(-19104);
               if (!var4) {
                  break label42;
               }
            }

            this.field10636 = arg0.method4280(-19104);
         }

         ++field10637;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field10638[2] + (arg0 != null ? field10638[4] : field10638[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "a",
      descriptor = "(Lu;)V"
   )
   public static final void method5282(class80 arg0) {
      if (arg0 != null) {
         for(int var1 = 0; var1 < 2; ++var1) {
            class80 var2 = null;

            for(class80 var3 = class8.field111[var1]; var3 != null; var3 = var3.field1004) {
               if (arg0 == var3) {
                  if (var2 != null) {
                     var2.field1004 = var3.field1004;
                  } else {
                     class8.field111[var1] = var3.field1004;
                  }

                  class591.field8180 = true;
                  return;
               }

               var2 = var3;
            }

            class80 var4 = null;

            for(class80 var5 = class735.field10736[var1]; var5 != null; var5 = var5.field1004) {
               if (arg0 == var5) {
                  if (var4 != null) {
                     var4.field1004 = var5.field1004;
                  } else {
                     class735.field10736[var1] = var5.field1004;
                  }

                  class591.field8180 = true;
                  return;
               }

               var4 = var5;
            }

            class80 var6 = null;

            for(class80 var7 = class234.field2900[var1]; var7 != null; var7 = var7.field1004) {
               if (arg0 == var7) {
                  if (var6 != null) {
                     var6.field1004 = var7.field1004;
                  } else {
                     class234.field2900[var1] = var7.field1004;
                  }

                  class591.field8180 = true;
                  return;
               }

               var6 = var7;
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "<init>",
      descriptor = "()V"
   )
   public class726() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!jha",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method5283(byte arg0) {
      try {
         if (arg0 == 40) {
            field10635 = null;
            field10630 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10638[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "h",
      descriptor = "(I)V"
   )
   public static final void method5284(int arg0) {
      try {
         class529.field7262 = -1;
         ++field10629;
         class666.field9474 = 0;
         class196.field2380 = -1;
         if (arg0 < 101) {
            method5284(26);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10638[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5285(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5286(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 107;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
