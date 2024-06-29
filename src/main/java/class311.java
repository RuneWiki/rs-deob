import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nka")
public class class311 {
   @OriginalMember(
      owner = "client!nka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4124 = new String[]{method2337(method2336("\u0012P?QIT")), method2337(method2336("\u0012P?QJT")), method2337(method2336("\u0012P?QKT")), method2337(method2336("\u0012P?QMT")), method2337(method2336("\u0012P?QNT")), method2337(method2336("\u0012P?QLT"))};
   @OriginalMember(
      owner = "client!nka",
      name = "b",
      descriptor = "[[I"
   )
   public static int[][] field4120 = new int[][]{{0, 1, 2, 3}, {1, -1, -1, 0}, {-1, 2, -1, 0}, {-1, 0, -1, 2}, {0, 1, -1, 2}, {1, 2, -1, 0}, {-1, 4, -1, 1}, {-1, 3, 4, -1}, {-1, 0, 2, -1}, {-1, -1, 2, 0}, {0, 2, 5, 3}, {0, -1, 6, -1}, {0, 1, 2, 3}};
   @OriginalMember(
      owner = "client!nka",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field4123 = new int[5];
   @OriginalMember(
      owner = "client!nka",
      name = "c",
      descriptor = "I"
   )
   public static int field4114;
   @OriginalMember(
      owner = "client!nka",
      name = "e",
      descriptor = "I"
   )
   public int field4115;
   @OriginalMember(
      owner = "client!nka",
      name = "h",
      descriptor = "I"
   )
   public static int field4116;
   @OriginalMember(
      owner = "client!nka",
      name = "d",
      descriptor = "I"
   )
   public static int field4117;
   @OriginalMember(
      owner = "client!nka",
      name = "g",
      descriptor = "I"
   )
   public static int field4119;
   @OriginalMember(
      owner = "client!nka",
      name = "a",
      descriptor = "I"
   )
   public static int field4121;
   @OriginalMember(
      owner = "client!nka",
      name = "f",
      descriptor = "I"
   )
   private int field4122;
   @OriginalMember(
      owner = "client!nka",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field4118;

   @OriginalMember(
      owner = "client!nka",
      name = "a",
      descriptor = "(IIBI)Z"
   )
   public final boolean method2330(int arg0, int arg1, byte arg2, int arg3) {
      boolean var5 = client.field4273;

      try {
         if (arg2 > 0) {
            field4123 = null;
         }

         ++field4114;
         int var6 = this.field4122;
         if (~this.field4115 == ~arg3 && this.field4122 == 0) {
            return false;
         } else {
            boolean var7;
            label170: {
               if (this.field4122 == 0) {
                  if (~arg3 < ~this.field4115 && this.field4115 + arg1 >= arg3 || ~this.field4115 < ~arg3 && arg3 >= -arg1 + this.field4115) {
                     this.field4115 = arg3;
                     return false;
                  }

                  var7 = true;
                  if (!var5) {
                     break label170;
                  }
               }

               if (~this.field4122 >= -1 || ~this.field4115 <= ~arg3) {
                  if (~this.field4122 <= -1 || ~this.field4115 >= ~arg3) {
                     var7 = false;
                     if (!var5) {
                        break label170;
                     }
                  }

                  int var8 = this.field4122 * this.field4122 / (arg1 * 2);
                  int var9 = -var8 + this.field4115;
                  if (arg3 >= var9 || var9 > this.field4115) {
                     var7 = false;
                     if (!var5) {
                        break label170;
                     }
                  }

                  var7 = true;
                  if (!var5) {
                     break label170;
                  }
               }

               int var10 = this.field4122 * this.field4122 / (arg1 * 2);
               int var11 = this.field4115 + var10;
               if (arg3 > var11 && ~var11 <= ~this.field4115) {
                  var7 = true;
                  if (!var5) {
                     break label170;
                  }
               }

               var7 = false;
            }

            label163: {
               if (!var7) {
                  if (this.field4122 > 0) {
                     this.field4122 -= arg1;
                     if (this.field4122 >= 0) {
                        break label163;
                     }

                     this.field4122 = 0;
                     if (!var5) {
                        break label163;
                     }
                  }

                  this.field4122 += arg1;
                  if (~this.field4122 >= -1) {
                     break label163;
                  }

                  this.field4122 = 0;
                  if (!var5) {
                     break label163;
                  }
               }

               label101: {
                  if (arg3 > this.field4115) {
                     this.field4122 += arg1;
                     if (~arg0 == -1 || ~arg0 <= ~this.field4122) {
                        break label101;
                     }

                     this.field4122 = arg0;
                     if (!var5) {
                        break label101;
                     }
                  }

                  this.field4122 -= arg1;
                  if (arg0 != 0 && ~(-arg0) < ~this.field4122) {
                     this.field4122 = -arg0;
                  }
               }

               if (this.field4122 != var6) {
                  label92: {
                     int var12 = this.field4122 * this.field4122 / (arg1 * 2);
                     if (this.field4115 >= arg3) {
                        if (~this.field4115 >= ~arg3 || arg3 <= this.field4115 - var12) {
                           break label92;
                        }

                        this.field4122 = var6;
                        if (!var5) {
                           break label92;
                        }
                     }

                     if (~(this.field4115 + var12) < ~arg3) {
                        this.field4122 = var6;
                     }
                  }
               }
            }

            this.field4115 += this.field4122 + var6 >> 1;
            return var7;
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field4124[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nka",
      name = "a",
      descriptor = "(I)Lbn;"
   )
   public static final class471 method2331(int arg0) {
      try {
         ++field4116;
         class471 var1 = class546.method3942((byte)-120);
         var1.field6523 = 0;
         var1.field6524 = null;
         var1.field6527 = new class206(5000);
         int var2 = 23 / ((arg0 - 36) / 57);
         return var1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4124[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nka",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2332(int arg0) {
      try {
         field4120 = null;
         if (arg0 == -1) {
            field4123 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4124[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nka",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method2333(byte arg0) {
      try {
         ++field4117;
         return arg0 < 6 ? -96 : 16383 & this.field4115;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4124[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nka",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2334(int arg0) {
      try {
         ++field4119;
         if (arg0 == -6732) {
            this.field4115 &= 16383;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field4124[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nka",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method2335(int arg0, byte arg1) {
      try {
         this.field4122 = 0;
         ++field4121;
         this.field4115 = arg0;
         if (arg1 >= -87) {
            this.method2334(125);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field4124[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2336(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2337(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
