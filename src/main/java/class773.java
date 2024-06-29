import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class773 extends class500 {
   @OriginalMember(
      owner = "client!fl",
      name = "q",
      descriptor = "I"
   )
   public int field11153;
   @OriginalMember(
      owner = "client!fl",
      name = "m",
      descriptor = "I"
   )
   public int field11156;
   @OriginalMember(
      owner = "client!fl",
      name = "p",
      descriptor = "[[I"
   )
   public int[][] field11151;
   @OriginalMember(
      owner = "client!fl",
      name = "l",
      descriptor = "[I"
   )
   public int[] field11150;
   @OriginalMember(
      owner = "client!fl",
      name = "n",
      descriptor = "[Z"
   )
   public boolean[] field11152;
   @OriginalMember(
      owner = "client!fl",
      name = "k",
      descriptor = "[I"
   )
   public int[] field11155;
   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11157 = new String[]{method5534(method5533("\u00070\"F|")), method5534(method5533("\u00070\"E|")), method5534(method5533("\u000f)`h")), method5534(method5533("\u00070\"8=\u000f5x:|")), method5534(method5533("\u001ar\"*)"))};
   @OriginalMember(
      owner = "client!fl",
      name = "r",
      descriptor = "[[I"
   )
   public static int[][] field11149 = new int[][]{{0, 1, 2, 3}, {1, 2, 3, 0}, {1, 2, -1, 0}, {2, 0, -1, 1}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 1, 3, -1}, {-1, 0, 2, -1}, {3, 5, 2, 0}, {0, 2, 5, 3}, {0, 2, 3, 5}, {0, 1, 2, 3}};
   @OriginalMember(
      owner = "client!fl",
      name = "o",
      descriptor = "I"
   )
   public static int field11154;
   @OriginalMember(
      owner = "client!fl",
      name = "j",
      descriptor = "Lkh;"
   )
   public static class17 field11148;

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method5531(int arg0) {
      boolean var1 = client.field4273;

      try {
         class239.method1795(104);
         ++field11154;
         if (arg0 != -3023) {
            field11148 = null;
         }

         label42: {
            label41: {
               int var2 = class674.field9907.field8471.method2851((byte)-116);
               if (~var2 != -3) {
                  if (var2 != 3) {
                     break label42;
                  }

                  if (!var1) {
                     break label41;
                  }
               }

               class297.method2240(100, class252.field3194, class338.field4832, class41.field479, 100, arg0 + 3015);
               if (!var1) {
                  break label42;
               }
            }

            class438.method3255(2, class41.field479, class338.field4832, class14.field190, true, class252.field3194, class133.field1733, 2);
         }

         if (class674.field9907.field8471.method2855((byte)116)) {
            class213.method1617((byte)12, class204.field2515);
         }

         if (class338.field4832 != null) {
            class535.method3852((byte)-112);
         }

         class33.field392 = ~class674.field9907.field8471.method2851((byte)-102) != -1;
         class775.field11283 = class674.field9907.field8471.method2855((byte)88);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11157[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5532(byte arg0) {
      try {
         field11148 = null;
         field11149 = null;
         if (arg0 != -126) {
            field11148 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field11157[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "<init>",
      descriptor = "(I[B)V"
   )
   public class773(int arg0, byte[] arg1) {
      boolean var3 = client.field4273;
      super();

      try {
         this.field11153 = arg0;
         class594 var4 = new class594(arg1);
         this.field11156 = var4.method4288((byte)78);
         this.field11151 = new int[this.field11156][];
         this.field11150 = new int[this.field11156];
         this.field11152 = new boolean[this.field11156];
         this.field11155 = new int[this.field11156];
         int var5 = 0;
         if (var3) {
            this.field11155[var5] = var4.method4288((byte)94);
            if (this.field11155[var5] == 6) {
               this.field11155[var5] = 2;
            }

            ++var5;
         }

         while(true) {
            if (~this.field11156 >= ~var5) {
               int var6 = 0;
               if (!var3) {
                  if (var3) {
                     this.field11152[var6] = ~var4.method4288((byte)114) == -2;
                     ++var6;
                  }

                  while(true) {
                     while(~this.field11156 < ~var6) {
                        this.field11152[var6] = ~var4.method4288((byte)114) == -2;
                        ++var6;
                     }

                     int var7 = 0;
                     if (!var3) {
                        if (var3) {
                           this.field11150[var7] = var4.method4280(-19104);
                           ++var7;
                        }

                        while(true) {
                           while(this.field11156 > var7) {
                              this.field11150[var7] = var4.method4280(-19104);
                              ++var7;
                           }

                           int var8 = 0;
                           if (!var3) {
                              if (var3) {
                                 this.field11151[var8] = new int[var4.method4288((byte)74)];
                                 ++var8;
                              }

                              while(true) {
                                 while(this.field11156 > var8) {
                                    this.field11151[var8] = new int[var4.method4288((byte)74)];
                                    ++var8;
                                 }

                                 int var9 = 0;
                                 if (!var3) {
                                    if (!var3 && ~var9 <= ~this.field11156) {
                                       return;
                                    }

                                    do {
                                       int var10 = 0;
                                       if (var3) {
                                          this.field11151[var9][var10] = var4.method4288((byte)85);
                                          ++var10;
                                       }

                                       while(true) {
                                          while(this.field11151[var9].length > var10) {
                                             this.field11151[var9][var10] = var4.method4288((byte)85);
                                             ++var10;
                                          }

                                          if (!var3) {
                                             ++var9;
                                             break;
                                          }

                                          ++var10;
                                       }
                                    } while(~var9 > ~this.field11156);

                                    return;
                                 }

                                 ++var8;
                              }
                           }

                           ++var7;
                        }
                     }

                     ++var6;
                  }
               }
            } else {
               this.field11155[var5] = var4.method4288((byte)94);
            }

            if (this.field11155[var5] == 6) {
               this.field11155[var5] = 2;
            }

            ++var5;
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field11157[3] + arg0 + ',' + (arg1 != null ? field11157[4] : field11157[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5533(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5534(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
