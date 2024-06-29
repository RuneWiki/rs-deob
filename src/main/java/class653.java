import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class653 {
   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "Lria;"
   )
   private class299 field9483 = null;
   @OriginalMember(
      owner = "client!tq",
      name = "d",
      descriptor = "Lria;"
   )
   private class299 field9482 = null;
   @OriginalMember(
      owner = "client!tq",
      name = "b",
      descriptor = "I"
   )
   private int field9485 = 65000;
   @OriginalMember(
      owner = "client!tq",
      name = "c",
      descriptor = "I"
   )
   private int field9484;
   @OriginalMember(
      owner = "client!tq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9488 = new String[]{method4804(method4803("i\u0003/\u000b\u001a")), method4804(method4803("f\\/dO")), method4804(method4803("s\u0007m&")), method4804(method4803("i\u0003/\t\u001a")), method4804(method4803("i\u0003/v[s\u001but\u001a")), method4804(method4803("i\u0003/\u000e\u001a")), method4804(method4803("i\u0003/\b\u001a")), method4804(method4803("^\u0013b\"W'")), method4804(method4803("i\u0003/>]N\u0006s#\\zZ"))};
   @OriginalMember(
      owner = "client!tq",
      name = "i",
      descriptor = "I"
   )
   public static int field9478;
   @OriginalMember(
      owner = "client!tq",
      name = "j",
      descriptor = "I"
   )
   public static int field9479;
   @OriginalMember(
      owner = "client!tq",
      name = "f",
      descriptor = "I"
   )
   public static int field9480;
   @OriginalMember(
      owner = "client!tq",
      name = "g",
      descriptor = "I"
   )
   public static int field9481;
   @OriginalMember(
      owner = "client!tq",
      name = "e",
      descriptor = "I"
   )
   public static int field9486;
   @OriginalMember(
      owner = "client!tq",
      name = "h",
      descriptor = "I"
   )
   public static int field9487;

   @OriginalMember(
      owner = "client!tq",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 12
   )
   public final String toString() {
      try {
         ++field9486;
         return field9488[7] + this.field9484;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9488[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(BZ[BII)Z",
      line = 20
   )
   private final boolean method4799(byte param1, boolean param2, byte[] param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "([BIII)Z",
      line = 141
   )
   public final boolean method4800(byte[] arg0, int arg1, int arg2, int arg3) {
      try {
         ++field9487;
         class299 var5 = this.field9482;
         synchronized(this.field9482) {
            if (arg3 >= 0 && ~arg3 >= ~this.field9485) {
               boolean var6 = this.method4799((byte)9, true, arg0, arg3, arg1);
               if (!var6) {
                  var6 = this.method4799((byte)117, false, arg0, arg3, arg1);
               }

               return arg2 != -18349 ? true : var6;
            } else {
               throw new IllegalArgumentException();
            }
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field9488[6] + (arg0 != null ? field9488[1] : field9488[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(II)[B",
      line = 169
   )
   public final byte[] method4801(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field9479;
         class299 var4 = this.field9482;
         synchronized(this.field9482) {
            try {
               if (~this.field9483.method2327(3564) > ~((long)(arg1 * 6 - -6))) {
                  return null;
               } else {
                  this.field9483.method2331((long)(arg1 * 6), true);
                  this.field9483.method2335(-1, 6, class544.field7883, 0);
                  int var6 = (class544.field7883[0] << 16 & 16711680) + ((255 & class544.field7883[1]) << 8) + (class544.field7883[2] & 255);
                  int var7 = (class544.field7883[5] & 255) + ((255 & class544.field7883[3]) << 16) + ((class544.field7883[4] & 255) << 8);
                  if (~var6 <= -1 && var6 <= this.field9485) {
                     if (arg0 != 7) {
                        this.toString();
                     }

                     if (~var7 < -1 && ~(this.field9482.method2327(arg0 + 3557) / 520L) <= ~((long)var7)) {
                        byte[] var10 = new byte[var6];
                        int var11 = 0;
                        int var12 = 0;
                        if (var3) {
                           if (~var7 == -1) {
                              return null;
                           }

                           this.field9482.method2331((long)(var7 * 520), true);
                        } else if (~var6 >= ~var11) {
                           if (!var3) {
                              return var10;
                           }
                        } else {
                           if (~var7 == -1) {
                              return null;
                           }

                           this.field9482.method2331((long)(var7 * 520), true);
                        }

                        while(true) {
                           int var14 = -var11 + var6;
                           if (var14 > 512) {
                              var14 = 512;
                           }

                           this.field9482.method2335(-1, var14 + 8, class544.field7883, 0);
                           int var15 = ((255 & class544.field7883[0]) << 8) + (class544.field7883[1] & 255);
                           int var16 = (65280 & class544.field7883[2] << 8) + (class544.field7883[3] & 255);
                           int var17 = ((255 & class544.field7883[4]) << 16) + ((255 & class544.field7883[5]) << 8) + (class544.field7883[6] & 255);
                           int var18 = class544.field7883[7] & 255;
                           if (arg1 != var15 || ~var12 != ~var16 || ~this.field9484 != ~var18) {
                              return null;
                           }

                           if (var17 < 0 || ~((long)var17) < ~(this.field9482.method2327(3564) / 520L)) {
                              return null;
                           }

                           int var21 = 0;
                           if (var3) {
                              var10[var11++] = class544.field7883[var21 + 8];
                              ++var21;
                           }

                           while(true) {
                              while(~var14 < ~var21) {
                                 var10[var11++] = class544.field7883[var21 + 8];
                                 ++var21;
                              }

                              if (!var3) {
                                 ++var12;
                                 if (~var6 >= ~var11) {
                                    if (!var3) {
                                       return var10;
                                    }
                                 } else {
                                    if (~var17 == -1) {
                                       return null;
                                    }

                                    this.field9482.method2331((long)(var17 * 520), true);
                                 }
                                 break;
                              }

                              ++var21;
                           }
                        }
                     } else {
                        return null;
                     }
                  } else {
                     return null;
                  }
               }
            } catch (IOException var41) {
               return null;
            }
         }
      } catch (RuntimeException var43) {
         throw class608.method4462(var43, field9488[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "<init>",
      descriptor = "(ILria;Lria;I)V",
      line = 364
   )
   public class653(int arg0, class299 arg1, class299 arg2, int arg3) {
      try {
         this.field9485 = arg3;
         this.field9483 = arg2;
         this.field9484 = arg0;
         this.field9482 = arg1;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9488[4] + arg0 + ',' + (arg1 != null ? field9488[1] : field9488[2]) + ',' + (arg2 != null ? field9488[1] : field9488[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(IIIIZI)V",
      line = 253
   )
   public static final void method4802(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
      boolean var6 = client.field4564;

      try {
         ++field9478;
         int var7 = -arg5 + arg0;
         int var8 = -arg1 + arg2;
         if (~var7 == -1) {
            if (~var8 != -1) {
               class65.method700(arg1, arg3, (byte)-117, arg5, arg2);
            }

         } else if (var8 == 0) {
            class598.method4416(arg0, arg5, arg1, (byte)-18, arg3);
         } else {
            if (!arg4) {
               field9481 = -128;
            }

            int var9;
            int var10;
            int var11;
            int var12;
            label82: {
               var9 = (var8 << 12) / var7;
               var10 = arg1 - (arg5 * var9 >> 12);
               if (class515.field7502 > arg5) {
                  var11 = (class515.field7502 * var9 >> 12) + var10;
                  var12 = class515.field7502;
                  if (!var6) {
                     break label82;
                  }
               }

               if (arg5 <= class130.field2163) {
                  var11 = arg1;
                  var12 = arg5;
                  if (!var6) {
                     break label82;
                  }
               }

               var12 = class130.field2163;
               var11 = (class130.field2163 * var9 >> 12) + var10;
            }

            int var13;
            int var14;
            label64: {
               if (class515.field7502 <= arg0) {
                  if (arg0 > class130.field2163) {
                     var13 = var10 - -(class130.field2163 * var9 >> 12);
                     var14 = class130.field2163;
                     if (!var6) {
                        break label64;
                     }
                  }

                  var14 = arg0;
                  var13 = arg2;
                  if (!var6) {
                     break label64;
                  }
               }

               var13 = (class515.field7502 * var9 >> 12) + var10;
               var14 = class515.field7502;
            }

            label56: {
               if (~class3.field16 < ~var11) {
                  var12 = (-var10 + class3.field16 << 12) / var9;
                  var11 = class3.field16;
                  if (!var6) {
                     break label56;
                  }
               }

               if (~var11 < ~class581.field8354) {
                  var11 = class581.field8354;
                  var12 = (-var10 + class581.field8354 << 12) / var9;
               }
            }

            label51: {
               if (~var13 <= ~class3.field16) {
                  if (~class581.field8354 <= ~var13) {
                     break label51;
                  }

                  var13 = class581.field8354;
                  var14 = (-var10 + class581.field8354 << 12) / var9;
                  if (!var6) {
                     break label51;
                  }
               }

               var14 = (-var10 + class3.field16 << 12) / var9;
               var13 = class3.field16;
            }

            class495.method3732(arg3, var12, var14, -1, var13, var11);
         }
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field9488[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4803(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4804(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 1;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
