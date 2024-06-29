import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class486 {
   @OriginalMember(
      owner = "client!ega",
      name = "d",
      descriptor = "Llj;"
   )
   private class304 field7389 = new class304(64);
   @OriginalMember(
      owner = "client!ega",
      name = "e",
      descriptor = "Lrr;"
   )
   private class678 field7391;
   @OriginalMember(
      owner = "client!ega",
      name = "c",
      descriptor = "Lrr;"
   )
   public class678 field7385;
   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7398 = new String[]{method3784(method3783(";1NJ~v")), method3784(method3783(";1NJyv")), method3784(method3783(";1NJ{v")), method3784(method3783(";1NJxv")), method3784(method3783(";1NJ\u000378F\u0010\u0001v")), method3784(method3783("0#C\b")), method3784(method3783("%x\u0001JB")), method3784(method3783(";1NJzv")), method3784(method3783(";1NJ}v")), method3784(method3783(";1NJ|v"))};
   @OriginalMember(
      owner = "client!ega",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field7388 = new int[5];
   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "Luk;"
   )
   public static class498 field7394 = new class498(36, -1);
   @OriginalMember(
      owner = "client!ega",
      name = "i",
      descriptor = "I"
   )
   public static int field7396 = 1;
   @OriginalMember(
      owner = "client!ega",
      name = "n",
      descriptor = "I"
   )
   public static int field7397 = 2;
   @OriginalMember(
      owner = "client!ega",
      name = "g",
      descriptor = "I"
   )
   public static int field7383;
   @OriginalMember(
      owner = "client!ega",
      name = "l",
      descriptor = "I"
   )
   public static int field7384;
   @OriginalMember(
      owner = "client!ega",
      name = "o",
      descriptor = "I"
   )
   public static int field7386;
   @OriginalMember(
      owner = "client!ega",
      name = "j",
      descriptor = "I"
   )
   public static int field7387;
   @OriginalMember(
      owner = "client!ega",
      name = "h",
      descriptor = "I"
   )
   public static int field7392;
   @OriginalMember(
      owner = "client!ega",
      name = "k",
      descriptor = "I"
   )
   public static int field7393;
   @OriginalMember(
      owner = "client!ega",
      name = "b",
      descriptor = "I"
   )
   public static int field7395;
   @OriginalMember(
      owner = "client!ega",
      name = "m",
      descriptor = "[Z"
   )
   public static boolean[] field7390;

   @OriginalMember(
      owner = "client!ega",
      name = "b",
      descriptor = "(II)V",
      line = 4
   )
   public final void method3776(int arg0, int arg1) {
      try {
         class304 var3 = this.field7389;
         synchronized(this.field7389) {
            this.field7389.method2552(arg0, 21533);
            if (arg1 > -89) {
               this.method3782((byte)-106);
            }
         }

         ++field7393;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7398[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(IIBIIIII)V",
      line = 19
   )
   public static final void method3777(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field1786;

      try {
         ++field7383;
         int var9 = 0;
         int var10 = arg4;
         int var11 = 0;
         int var12 = -arg7 + arg6;
         int var13 = arg4 - arg7;
         int var14 = arg6 * arg6;
         if (arg2 <= 70) {
            method3780(7, (byte)-122);
         }

         int var15 = arg4 * arg4;
         int var16 = var12 * var12;
         int var17 = var13 * var13;
         int var18 = var15 << 1;
         int var19 = var14 << 1;
         int var20 = var17 << 1;
         int var21 = var16 << 1;
         int var22 = arg4 << 1;
         int var23 = var13 << 1;
         int var24 = (1 - var22) * var14 - -var18;
         int var25 = -((var22 + -1) * var19) + var15;
         int var26 = (-var23 + 1) * var16 + var20;
         int var27 = var17 - (var23 + -1) * var21;
         int var28 = var14 << 2;
         int var29 = var15 << 2;
         int var30 = var16 << 2;
         int var31 = var17 << 2;
         int var32 = var18 * 3;
         int var33 = (var22 + -3) * var19;
         int var34 = var20 * 3;
         int var35 = (var23 - 3) * var21;
         int var36 = var29;
         int var37 = (arg4 - 1) * var28;
         int var38 = var31;
         if (~class368.field5724 >= ~arg3 && class84.field1212 >= arg3) {
            int[] var39 = class512.field7820[arg3];
            int var40 = class47.method332(-arg6 + arg1, class182.field2833, 15989, class443.field6806);
            int var41 = class47.method332(arg1 + arg6, class182.field2833, 15989, class443.field6806);
            int var42 = class47.method332(arg1 - var12, class182.field2833, 15989, class443.field6806);
            int var43 = class47.method332(arg1 + var12, class182.field2833, 15989, class443.field6806);
            class689.method5076(var42, var40, (byte)57, var39, arg0);
            class689.method5076(var43, var42, (byte)57, var39, arg5);
            class689.method5076(var41, var43, (byte)57, var39, arg0);
         }

         int var44 = (var13 - 1) * var30;
         boolean var10000;
         if (var8) {
            var10000 = ~arg4 >= ~var13;
         } else {
            if (~arg4 >= -1) {
               return;
            }

            var10000 = ~arg4 >= ~var13;
         }

         while(true) {
            while(true) {
               boolean var45 = var10000;
               if (var45) {
                  label216: {
                     if (var26 < 0) {
                        if (var8) {
                           var27 += var38;
                           var26 += var34;
                           ++var11;
                           var38 += var31;
                           var34 += var31;
                        }
                     } else {
                        if (!var8) {
                           if (var27 < 0) {
                              var26 += var34;
                              var27 += var38;
                              var38 += var31;
                              var34 += var31;
                              ++var11;
                           }

                           var26 += -var44;
                           var27 += -var35;
                           var44 -= var30;
                           var35 -= var30;
                           break label216;
                        }

                        var34 = var27;
                     }

                     while(true) {
                        while(~var26 > -1) {
                           var27 += var38;
                           var26 += var34;
                           ++var11;
                           var38 += var31;
                           var34 += var31;
                        }

                        if (!var8) {
                           if (var27 < 0) {
                              var26 += var34;
                              var27 += var38;
                              var38 += var31;
                              var34 += var31;
                              ++var11;
                           }

                           var26 += -var44;
                           var27 += -var35;
                           var44 -= var30;
                           var35 -= var30;
                           break;
                        }

                        var34 = var27;
                     }
                  }
               }

               int var56;
               label186: {
                  if (var24 < 0) {
                     if (var8) {
                        var25 += var36;
                        var24 += var32;
                        ++var9;
                        var32 += var29;
                        var36 += var29;
                     }
                  } else {
                     var56 = var25;
                     if (!var8) {
                        break label186;
                     }

                     var36 = var25;
                  }

                  while(true) {
                     while(~var24 > -1) {
                        var25 += var36;
                        var24 += var32;
                        ++var9;
                        var32 += var29;
                        var36 += var29;
                     }

                     var56 = var25;
                     if (!var8) {
                        break;
                     }

                     var36 = var25;
                  }
               }

               if (var56 < 0) {
                  var25 += var36;
                  var24 += var32;
                  ++var9;
                  var36 += var29;
                  var32 += var29;
               }

               var25 += -var33;
               var24 += -var37;
               --var10;
               var33 -= var28;
               var37 -= var28;
               int var46 = -var10 + arg3;
               int var47 = arg3 + var10;
               if (var47 >= class368.field5724) {
                  int var10001 = class84.field1212;
                  if (var8) {
                     var10000 = var46 >= var10001;
                     continue;
                  }

                  if (var46 <= var10001) {
                     int var48 = class47.method332(arg1 + var9, class182.field2833, 15989, class443.field6806);
                     int var49 = class47.method332(-var9 + arg1, class182.field2833, 15989, class443.field6806);
                     int var50;
                     int var51;
                     int[] var52;
                     int[] var53;
                     if (!var45) {
                        if (class368.field5724 <= var46) {
                           class689.method5076(var48, var49, (byte)57, class512.field7820[var46], arg0);
                        }

                        if (~class84.field1212 <= ~var47) {
                           class689.method5076(var48, var49, (byte)57, class512.field7820[var47], arg0);
                           if (var8) {
                              var50 = class47.method332(arg1 + var11, class182.field2833, 15989, class443.field6806);
                              var51 = class47.method332(arg1 - var11, class182.field2833, 15989, class443.field6806);
                              if (~var46 <= ~class368.field5724) {
                                 var52 = class512.field7820[var46];
                                 class689.method5076(var51, var49, (byte)57, var52, arg0);
                                 class689.method5076(var50, var51, (byte)57, var52, arg5);
                                 class689.method5076(var48, var50, (byte)57, var52, arg0);
                              }

                              if (~class84.field1212 <= ~var47) {
                                 var53 = class512.field7820[var47];
                                 class689.method5076(var51, var49, (byte)57, var53, arg0);
                                 class689.method5076(var50, var51, (byte)57, var53, arg5);
                                 class689.method5076(var48, var50, (byte)57, var53, arg0);
                              }
                           }
                        }
                     } else {
                        var50 = class47.method332(arg1 + var11, class182.field2833, 15989, class443.field6806);
                        var51 = class47.method332(arg1 - var11, class182.field2833, 15989, class443.field6806);
                        if (~var46 <= ~class368.field5724) {
                           var52 = class512.field7820[var46];
                           class689.method5076(var51, var49, (byte)57, var52, arg0);
                           class689.method5076(var50, var51, (byte)57, var52, arg5);
                           class689.method5076(var48, var50, (byte)57, var52, arg0);
                        }

                        if (~class84.field1212 <= ~var47) {
                           var53 = class512.field7820[var47];
                           class689.method5076(var51, var49, (byte)57, var53, arg0);
                           class689.method5076(var50, var51, (byte)57, var53, arg5);
                           class689.method5076(var48, var50, (byte)57, var53, arg0);
                        }
                     }
                  }
               }

               if (~var10 >= -1) {
                  return;
               }

               var10000 = ~var10 >= ~var13;
            }
         }
      } catch (RuntimeException var55) {
         throw class482.method3757(var55, field7398[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(Z)V",
      line = 221
   )
   public static void method3778(boolean arg0) {
      try {
         field7390 = null;
         field7394 = null;
         field7388 = null;
         if (arg0) {
            field7396 = 32;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7398[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(I)V",
      line = 233
   )
   public final void method3779(int arg0) {
      try {
         ++field7392;
         class304 var2 = this.field7389;
         synchronized(this.field7389) {
            this.field7389.method2551(true);
         }

         if (arg0 != 0) {
            this.method3782((byte)-107);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7398[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(IB)[B",
      line = 259
   )
   public static final byte[] method3780(int arg0, byte arg1) {
      boolean var2 = client.field1786;

      try {
         ++field7384;
         class770 var3 = (class770)class63.field842.method3178(0, (long)arg0);
         int var4 = 79 % ((arg1 - -35) / 63);
         if (var3 == null) {
            byte[] var5 = new byte[512];
            Random var6 = new Random((long)arg0);
            int var7 = 0;
            if (var2) {
               var5[var7] = (byte)var7;
               ++var7;
            }

            while(true) {
               while(var7 < 255) {
                  var5[var7] = (byte)var7;
                  ++var7;
               }

               int var8 = 0;
               if (!var2) {
                  if (var2 || var8 < 255) {
                     do {
                        int var9 = -var8 + 255;
                        int var10 = class784.method5696((byte)25, var9, var6);
                        byte var11 = var5[var10];
                        var5[var10] = var5[var9];
                        var5[var9] = var5[-var8 + 511] = var11;
                        ++var8;
                     } while(var8 < 255);
                  }

                  var3 = new class770(var5);
                  class63.field842.method3183((long)arg0, var3, (byte)120);
                  break;
               }

               ++var7;
            }
         }

         return var3.field11340;
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field7398[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(II)Lifa;",
      line = 309
   )
   public final class233 method3781(int arg0, int arg1) {
      try {
         int var3 = 2 / ((arg1 - -42) / 54);
         ++field7395;
         class304 var4 = this.field7389;
         class233 var5;
         synchronized(this.field7389) {
            var5 = (class233)this.field7389.method2544(false, (long)arg0);
         }

         if (var5 != null) {
            return var5;
         } else {
            class678 var6 = this.field7391;
            byte[] var7;
            synchronized(this.field7391) {
               var7 = this.field7391.method5017(3, arg0, (byte)71);
            }

            class233 var8 = new class233();
            var8.field3572 = this;
            if (var7 != null) {
               var8.method2007(new class354(var7), (byte)-46);
            }

            class304 var9 = this.field7389;
            synchronized(this.field7389) {
               this.field7389.method2545((long)arg0, 121, var8);
               return var8;
            }
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field7398[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "<init>",
      descriptor = "(Ltv;ILrr;Lrr;)V",
      line = 341
   )
   public class486(class311 arg0, int arg1, class678 arg2, class678 arg3) {
      try {
         this.field7391 = arg2;
         this.field7385 = arg3;
         this.field7391.method4998((byte)-82, 3);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7398[4] + (arg0 != null ? field7398[6] : field7398[5]) + ',' + arg1 + ',' + (arg2 != null ? field7398[6] : field7398[5]) + ',' + (arg3 != null ? field7398[6] : field7398[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(B)V",
      line = 359
   )
   public final void method3782(byte arg0) {
      try {
         if (arg0 > -126) {
            field7394 = null;
         }

         class304 var2 = this.field7389;
         synchronized(this.field7389) {
            this.field7389.method2554(-114);
         }

         ++field7386;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7398[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3783(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3784(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
