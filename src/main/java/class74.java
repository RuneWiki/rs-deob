import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class74 {
   @OriginalMember(
      owner = "client!qh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1315 = new String[]{method780(method779("\u0014\u0011}V*6\r!K+\u0002Q")), method780(method779("\u0014\u0011}`m")), method780(method779("\u0014\u0011}cm"))};
   @OriginalMember(
      owner = "client!qh",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   public static String field1309 = null;
   @OriginalMember(
      owner = "client!qh",
      name = "a",
      descriptor = "Ljava/util/Hashtable;"
   )
   public static Hashtable field1312 = new Hashtable();
   @OriginalMember(
      owner = "client!qh",
      name = "c",
      descriptor = "I"
   )
   public static int field1310;
   @OriginalMember(
      owner = "client!qh",
      name = "d",
      descriptor = "I"
   )
   public static int field1311;
   @OriginalMember(
      owner = "client!qh",
      name = "f",
      descriptor = "I"
   )
   public static int field1313;
   @OriginalMember(
      owner = "client!qh",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field1314;

   @OriginalMember(
      owner = "client!qh",
      name = "a",
      descriptor = "(IIBIIII)V",
      line = 3
   )
   public static final void method777(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4564;

      try {
         ++field1313;
         class440.method3316(125, arg1);
         int var8 = 0;
         int var9 = -arg3 + arg1;
         if (var9 < 0) {
            var9 = 0;
         }

         int var10 = arg1;
         int var11 = -arg1;
         int var12 = var9;
         int var13 = -var9;
         byte var14 = -1;
         if (~class3.field16 >= ~arg5 && arg5 <= class581.field8354) {
            int[] var15 = class448.field6542[arg5];
            int var16 = class741.method5346(-arg1 + arg6, class515.field7502, class130.field2163, -1);
            int var17 = class741.method5346(arg1 + arg6, class515.field7502, class130.field2163, -1);
            int var18 = class741.method5346(arg6 - var9, class515.field7502, class130.field2163, -1);
            int var19 = class741.method5346(arg6 + var9, class515.field7502, class130.field2163, -1);
            class18.method132(false, var16, var18, arg4, var15);
            class18.method132(false, var18, var19, arg0, var15);
            class18.method132(false, var19, var17, arg4, var15);
         }

         byte var20 = -1;
         int var21 = -32 % ((18 - arg2) / 52);
         int var46;
         int var47;
         if (var7) {
            var47 = var20 + 2;
            var46 = var14 + 2;
            var11 += var46;
            var13 += var47;
            if (~var13 <= -1 && ~var9 <= -2) {
               var12 = var9 - 1;
               var13 -= var12 << 1;
               class85.field1400[var12] = var8;
            }
         } else {
            if (~var8 <= ~arg1) {
               return;
            }

            var47 = var20 + 2;
            var46 = var14 + 2;
            var11 += var46;
            var13 += var47;
            if (~var13 <= -1 && ~var9 <= -2) {
               var12 = var9 - 1;
               var13 -= var12 << 1;
               class85.field1400[var12] = var8;
            }
         }

         while(true) {
            while(true) {
               ++var8;
               if (var11 >= 0) {
                  --var10;
                  var11 -= var10 << 1;
                  int var22 = arg5 - var10;
                  int var23 = arg5 + var10;
                  if (class3.field16 <= var23 && class581.field8354 >= var22) {
                     int var31;
                     int var32;
                     if (~var10 > ~var9) {
                        int var24 = class85.field1400[var10];
                        int var25 = class741.method5346(arg6 - -var8, class515.field7502, class130.field2163, -1);
                        int var26 = class741.method5346(-var8 + arg6, class515.field7502, class130.field2163, -1);
                        int var27 = class741.method5346(arg6 + var24, class515.field7502, class130.field2163, -1);
                        int var28 = class741.method5346(-var24 + arg6, class515.field7502, class130.field2163, -1);
                        if (var23 <= class581.field8354) {
                           int[] var29 = class448.field6542[var23];
                           class18.method132(false, var26, var28, arg4, var29);
                           class18.method132(false, var28, var27, arg0, var29);
                           class18.method132(false, var27, var25, arg4, var29);
                        }

                        if (var22 >= class3.field16) {
                           int[] var30 = class448.field6542[var22];
                           class18.method132(false, var26, var28, arg4, var30);
                           class18.method132(false, var28, var27, arg0, var30);
                           class18.method132(false, var27, var25, arg4, var30);
                           if (var7) {
                              var31 = class741.method5346(arg6 + var8, class515.field7502, class130.field2163, -1);
                              var32 = class741.method5346(-var8 + arg6, class515.field7502, class130.field2163, -1);
                              if (var23 <= class581.field8354) {
                                 class18.method132(false, var32, var31, arg4, class448.field6542[var23]);
                              }

                              if (~class3.field16 >= ~var22) {
                                 class18.method132(false, var32, var31, arg4, class448.field6542[var22]);
                              }
                           }
                        }
                     } else {
                        var31 = class741.method5346(arg6 + var8, class515.field7502, class130.field2163, -1);
                        var32 = class741.method5346(-var8 + arg6, class515.field7502, class130.field2163, -1);
                        if (var23 <= class581.field8354) {
                           class18.method132(false, var32, var31, arg4, class448.field6542[var23]);
                        }

                        if (~class3.field16 >= ~var22) {
                           class18.method132(false, var32, var31, arg4, class448.field6542[var22]);
                        }
                     }
                  }
               }

               int var33 = -var8 + arg5;
               int var34 = arg5 + var8;
               if (class3.field16 <= var34) {
                  int var10000 = class581.field8354;
                  if (var7) {
                     if (var10000 <= var33 && ~var12 <= -2) {
                        --var12;
                        var13 -= var12 << 1;
                        class85.field1400[var12] = var8;
                     }
                     continue;
                  }

                  if (var10000 >= var33) {
                     int var35 = arg6 + var10;
                     int var36 = arg6 - var10;
                     if (class515.field7502 <= var35 && class130.field2163 >= var36) {
                        int var37 = class741.method5346(var35, class515.field7502, class130.field2163, -1);
                        int var38 = class741.method5346(var36, class515.field7502, class130.field2163, -1);
                        int var39;
                        int var40;
                        int var41;
                        int[] var42;
                        int[] var43;
                        if (var8 >= var9) {
                           if (~var34 >= ~class581.field8354) {
                              class18.method132(false, var38, var37, arg4, class448.field6542[var34]);
                           }

                           if (~var33 <= ~class3.field16) {
                              class18.method132(false, var38, var37, arg4, class448.field6542[var33]);
                              if (var7) {
                                 var39 = var12 < var8 ? class85.field1400[var8] : var12;
                                 var40 = class741.method5346(arg6 + var39, class515.field7502, class130.field2163, -1);
                                 var41 = class741.method5346(-var39 + arg6, class515.field7502, class130.field2163, -1);
                                 if (class581.field8354 >= var34) {
                                    var42 = class448.field6542[var34];
                                    class18.method132(false, var38, var41, arg4, var42);
                                    class18.method132(false, var41, var40, arg0, var42);
                                    class18.method132(false, var40, var37, arg4, var42);
                                 }

                                 if (~var33 <= ~class3.field16) {
                                    var43 = class448.field6542[var33];
                                    class18.method132(false, var38, var41, arg4, var43);
                                    class18.method132(false, var41, var40, arg0, var43);
                                    class18.method132(false, var40, var37, arg4, var43);
                                 }
                              }
                           }
                        } else {
                           var39 = var12 < var8 ? class85.field1400[var8] : var12;
                           var40 = class741.method5346(arg6 + var39, class515.field7502, class130.field2163, -1);
                           var41 = class741.method5346(-var39 + arg6, class515.field7502, class130.field2163, -1);
                           if (class581.field8354 >= var34) {
                              var42 = class448.field6542[var34];
                              class18.method132(false, var38, var41, arg4, var42);
                              class18.method132(false, var41, var40, arg0, var42);
                              class18.method132(false, var40, var37, arg4, var42);
                           }

                           if (~var33 <= ~class3.field16) {
                              var43 = class448.field6542[var33];
                              class18.method132(false, var38, var41, arg4, var43);
                              class18.method132(false, var41, var40, arg0, var43);
                              class18.method132(false, var40, var37, arg4, var43);
                           }
                        }
                     }
                  }
               }

               if (~var8 <= ~var10) {
                  return;
               }

               var47 += 2;
               var46 += 2;
               var11 += var46;
               var13 += var47;
               if (~var13 <= -1 && ~var12 <= -2) {
                  --var12;
                  var13 -= var12 << 1;
                  class85.field1400[var12] = var8;
               }
            }
         }
      } catch (RuntimeException var45) {
         throw class608.method4462(var45, field1315[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qh",
      name = "a",
      descriptor = "(I)V",
      line = 189
   )
   public static void method778(int arg0) {
      try {
         if (arg0 != 2) {
            field1312 = null;
         }

         field1312 = null;
         field1309 = null;
         field1314 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1315[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qh",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 202
   )
   public final String toString() {
      try {
         ++field1310;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1315[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method779(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method780(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 83;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
