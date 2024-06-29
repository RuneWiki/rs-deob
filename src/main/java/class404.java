import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class404 {
   @OriginalMember(
      owner = "client!aia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5551 = new String[]{method3171(method3170("(:^r\u000fa")), method3171(method3170("(:^r\ba")), method3171(method3170("(:^r\ra")), method3171(method3170("(:^r\ta")), method3171(method3170("(:^r\u000ea"))};
   @OriginalMember(
      owner = "client!aia",
      name = "g",
      descriptor = "I"
   )
   public static int field5546 = -1;
   @OriginalMember(
      owner = "client!aia",
      name = "e",
      descriptor = "I"
   )
   public int field5543;
   @OriginalMember(
      owner = "client!aia",
      name = "b",
      descriptor = "I"
   )
   public static int field5544;
   @OriginalMember(
      owner = "client!aia",
      name = "f",
      descriptor = "I"
   )
   public static int field5545;
   @OriginalMember(
      owner = "client!aia",
      name = "d",
      descriptor = "I"
   )
   public static int field5547;
   @OriginalMember(
      owner = "client!aia",
      name = "h",
      descriptor = "I"
   )
   public static int field5548;
   @OriginalMember(
      owner = "client!aia",
      name = "c",
      descriptor = "I"
   )
   private int field5550;
   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   public static String field5549;

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3165(int arg0) {
      try {
         field5549 = null;
         if (arg0 != -1) {
            field5546 = 15;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5551[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(BIII)Z"
   )
   public final boolean method3166(byte arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field1481;

      try {
         ++field5548;
         int var6 = this.field5550;
         if (~this.field5543 == ~arg1 && ~this.field5550 == -1) {
            return false;
         } else {
            boolean var7;
            label174: {
               if (this.field5550 == 0) {
                  if (~arg1 < ~this.field5543 && this.field5543 - -arg2 >= arg1 || arg1 < this.field5543 && ~(-arg2 + this.field5543) >= ~arg1) {
                     this.field5543 = arg1;
                     return false;
                  }

                  var7 = true;
                  if (!var5) {
                     break label174;
                  }
               }

               if (~this.field5550 >= -1 || ~this.field5543 <= ~arg1) {
                  if (this.field5550 < 0 && arg1 < this.field5543) {
                     int var8 = this.field5550 * this.field5550 / (arg2 * 2);
                     int var9 = -var8 + this.field5543;
                     if (arg1 >= var9 || ~this.field5543 > ~var9) {
                        var7 = false;
                        if (!var5) {
                           break label174;
                        }
                     }

                     var7 = true;
                     if (!var5) {
                        break label174;
                     }
                  }

                  var7 = false;
                  if (!var5) {
                     break label174;
                  }
               }

               int var10 = this.field5550 * this.field5550 / (arg2 * 2);
               int var11 = this.field5543 + var10;
               if (arg1 <= var11 || this.field5543 > var11) {
                  var7 = false;
                  if (!var5) {
                     break label174;
                  }
               }

               var7 = true;
            }

            label165: {
               if (!var7) {
                  if (this.field5550 > 0) {
                     this.field5550 -= arg2;
                     if (this.field5550 >= 0) {
                        break label165;
                     }

                     this.field5550 = 0;
                     if (!var5) {
                        break label165;
                     }
                  }

                  this.field5550 += arg2;
                  if (this.field5550 <= 0) {
                     break label165;
                  }

                  this.field5550 = 0;
                  if (!var5) {
                     break label165;
                  }
               }

               label102: {
                  if (this.field5543 < arg1) {
                     this.field5550 += arg2;
                     if (arg3 == 0 || ~this.field5550 >= ~arg3) {
                        break label102;
                     }

                     this.field5550 = arg3;
                     if (!var5) {
                        break label102;
                     }
                  }

                  this.field5550 -= arg2;
                  if (arg3 != 0 && ~this.field5550 > ~(-arg3)) {
                     this.field5550 = -arg3;
                  }
               }

               if (this.field5550 != var6) {
                  label93: {
                     int var12 = this.field5550 * this.field5550 / (arg2 * 2);
                     if (arg1 > this.field5543) {
                        if (arg1 >= this.field5543 - -var12) {
                           break label93;
                        }

                        this.field5550 = var6;
                        if (!var5) {
                           break label93;
                        }
                     }

                     if (this.field5543 > arg1 && ~arg1 < ~(-var12 + this.field5543)) {
                        this.field5550 = var6;
                     }
                  }
               }
            }

            this.field5543 += this.field5550 + var6 >> 1;
            if (arg0 < 15) {
               field5546 = 79;
            }

            return var7;
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field5551[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method3167(byte arg0) {
      try {
         ++field5547;
         if (arg0 <= 37) {
            this.method3168(-64);
         }

         return 16383 & this.field5543;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5551[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3168(int arg0) {
      try {
         if (arg0 != -1) {
            method3165(62);
         }

         this.field5543 &= 16383;
         ++field5544;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5551[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method3169(byte arg0, int arg1) {
      try {
         this.field5550 = 0;
         if (arg0 != 108) {
            this.method3167((byte)-51);
         }

         ++field5545;
         this.field5543 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5551[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3170(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3171(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
