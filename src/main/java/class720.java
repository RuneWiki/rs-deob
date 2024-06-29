import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class720 {
   @OriginalMember(
      owner = "client!nu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10794 = new String[]{method5330(method5329("*L$j\u0007")), method5330(method5329("*L$n\u0007")), method5330(method5329("*L$l\u0007")), method5330(method5329("*L$m\u0007")), method5330(method5329("*L$o\u0007")), method5330(method5329("*L$i\u0007")), method5330(method5329("*L$k\u0007"))};
   @OriginalMember(
      owner = "client!nu",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field10792 = new int[13];
   @OriginalMember(
      owner = "client!nu",
      name = "i",
      descriptor = "Lnaa;"
   )
   public static class113 field10788 = new class113(21, -1);
   @OriginalMember(
      owner = "client!nu",
      name = "d",
      descriptor = "I"
   )
   public static int field10793 = 0;
   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "I"
   )
   public static int field10783;
   @OriginalMember(
      owner = "client!nu",
      name = "j",
      descriptor = "I"
   )
   private int field10784;
   @OriginalMember(
      owner = "client!nu",
      name = "c",
      descriptor = "I"
   )
   public int field10785;
   @OriginalMember(
      owner = "client!nu",
      name = "g",
      descriptor = "I"
   )
   public static int field10786;
   @OriginalMember(
      owner = "client!nu",
      name = "f",
      descriptor = "I"
   )
   public static int field10787;
   @OriginalMember(
      owner = "client!nu",
      name = "k",
      descriptor = "I"
   )
   public static int field10789;
   @OriginalMember(
      owner = "client!nu",
      name = "b",
      descriptor = "I"
   )
   public static int field10790;
   @OriginalMember(
      owner = "client!nu",
      name = "e",
      descriptor = "I"
   )
   public static int field10791;

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(B)I",
      line = 4
   )
   public final int method5322(byte arg0) {
      try {
         int var2 = -82 % ((arg0 - -5) / 42);
         ++field10789;
         return this.field10785 & 16383;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10794[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "b",
      descriptor = "(B)V",
      line = 14
   )
   public static final void method5323(byte arg0) {
      boolean var1 = client.field1786;

      try {
         ++field10791;
         class367.method3010();
         int var2 = 0;
         if (var1) {
            class221.field3326[var2].method3744(-98);
            ++var2;
         }

         while(true) {
            while(var2 < 4) {
               class221.field3326[var2].method3744(-98);
               ++var2;
            }

            class140.method1284((byte)-102);
            class600.method4442(-27112);
            class520.method4016(arg0 ^ 7);
            System.gc();
            class351.field5356.method655();
            if (!var1) {
               if (arg0 != 5) {
                  field10792 = null;
                  return;
               }

               return;
            }

            ++var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10794[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "c",
      descriptor = "(I)V",
      line = 41
   )
   public static void method5324(int arg0) {
      try {
         field10792 = null;
         int var1 = -22 % ((arg0 - 29) / 47);
         field10788 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10794[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(IIII)Z",
      line = 53
   )
   public final boolean method5325(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field1786;

      try {
         ++field10786;
         int var6 = this.field10784;
         if (this.field10785 == arg2 && ~this.field10784 == -1) {
            return false;
         } else {
            boolean var9;
            label155: {
               if (~this.field10784 != -1) {
                  if (this.field10784 > 0 && ~this.field10785 > ~arg2) {
                     int var7 = this.field10784 * this.field10784 / (arg1 * 2);
                     int var8 = this.field10785 - -var7;
                     if (var8 < arg2 && this.field10785 <= var8) {
                        var9 = true;
                        if (!var5) {
                           break label155;
                        }
                     }

                     var9 = false;
                     if (!var5) {
                        break label155;
                     }
                  }

                  if (this.field10784 >= 0 || ~this.field10785 >= ~arg2) {
                     var9 = false;
                     if (!var5) {
                        break label155;
                     }
                  }

                  int var10 = this.field10784 * this.field10784 / (arg1 * 2);
                  int var11 = -var10 + this.field10785;
                  if (arg2 < var11 && this.field10785 >= var11) {
                     var9 = true;
                     if (!var5) {
                        break label155;
                     }
                  }

                  var9 = false;
                  if (!var5) {
                     break label155;
                  }
               }

               if (this.field10785 < arg2 && ~arg2 >= ~(this.field10785 + arg1) || ~this.field10785 < ~arg2 && ~(-arg1 + this.field10785) >= ~arg2) {
                  this.field10785 = arg2;
                  return false;
               }

               var9 = true;
            }

            label157: {
               if (var9) {
                  label113: {
                     if (arg2 > this.field10785) {
                        this.field10784 += arg1;
                        if (~arg3 == -1 || ~arg3 <= ~this.field10784) {
                           break label113;
                        }

                        this.field10784 = arg3;
                        if (!var5) {
                           break label113;
                        }
                     }

                     this.field10784 -= arg1;
                     if (arg3 != 0 && ~this.field10784 > ~(-arg3)) {
                        this.field10784 = -arg3;
                     }
                  }

                  if (~this.field10784 == ~var6) {
                     break label157;
                  }

                  int var12 = this.field10784 * this.field10784 / (arg1 * 2);
                  if (~arg2 >= ~this.field10785) {
                     if (~this.field10785 >= ~arg2 || this.field10785 - var12 >= arg2) {
                        break label157;
                     }

                     this.field10784 = var6;
                     if (!var5) {
                        break label157;
                     }
                  }

                  if (arg2 >= this.field10785 + var12) {
                     break label157;
                  }

                  this.field10784 = var6;
                  if (!var5) {
                     break label157;
                  }
               }

               if (~this.field10784 >= -1) {
                  this.field10784 += arg1;
                  if (this.field10784 <= 0) {
                     break label157;
                  }

                  this.field10784 = 0;
                  if (!var5) {
                     break label157;
                  }
               }

               this.field10784 -= arg1;
               if (~this.field10784 > -1) {
                  this.field10784 = 0;
               }
            }

            this.field10785 += this.field10784 + var6 >> 1;
            if (arg0 <= 87) {
               field10792 = null;
            }

            return var9;
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field10794[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(BI)V",
      line = 191
   )
   public final void method5326(byte arg0, int arg1) {
      try {
         ++field10783;
         this.field10785 = arg1;
         this.field10784 = 0;
         if (arg0 < 14) {
            field10793 = 44;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10794[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "b",
      descriptor = "(I)V",
      line = 204
   )
   public final void method5327(int arg0) {
      try {
         ++field10787;
         int var2 = 124 / ((48 - arg0) / 60);
         this.field10785 &= 16383;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10794[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "a",
      descriptor = "(I)I",
      line = 221
   )
   public static final int method5328(int arg0) {
      boolean var1 = client.field1786;

      try {
         byte var3;
         label40: {
            ++field10790;
            if (~class480.field7293 <= -97) {
               int var2 = class247.method2103(false);
               if (~var2 >= -101) {
                  class238.method2032(false);
                  var3 = 4;
                  if (!var1) {
                     break label40;
                  }
               }

               if (var2 > 500) {
                  if (var2 <= 1000) {
                     var3 = 2;
                     class713.method5285((byte)-56);
                     if (!var1) {
                        break label40;
                     }
                  }

                  var3 = 1;
                  class491.method3804(true, true);
                  if (!var1) {
                     break label40;
                  }
               }

               var3 = 3;
               class143.method1299(1);
               if (!var1) {
                  break label40;
               }
            }

            var3 = 1;
            class491.method3804(true, true);
         }

         if (~class687.field10213.field507.method3440(480102311) != -1) {
            class687.field10213.method299(-17, 0, class687.field10213.field494);
            class473.method3678(2744, 0, false);
         }

         class388.method3135(0);
         return arg0 >= -32 ? -23 : var3;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10794[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5329(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5330(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
