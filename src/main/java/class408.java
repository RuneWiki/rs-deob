import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class408 {
   @OriginalMember(
      owner = "client!lba",
      name = "p",
      descriptor = "I"
   )
   private int field6354 = 0;
   @OriginalMember(
      owner = "client!lba",
      name = "e",
      descriptor = "I"
   )
   private int field6353 = -1;
   @OriginalMember(
      owner = "client!lba",
      name = "g",
      descriptor = "Lsn;"
   )
   private class675 field6347 = new class675();
   @OriginalMember(
      owner = "client!lba",
      name = "h",
      descriptor = "Z"
   )
   public boolean field6361 = false;
   @OriginalMember(
      owner = "client!lba",
      name = "m",
      descriptor = "I"
   )
   private int field6349;
   @OriginalMember(
      owner = "client!lba",
      name = "i",
      descriptor = "I"
   )
   private int field6350;
   @OriginalMember(
      owner = "client!lba",
      name = "o",
      descriptor = "[Lhg;"
   )
   private class733[] field6357;
   @OriginalMember(
      owner = "client!lba",
      name = "d",
      descriptor = "[[[I"
   )
   private int[][][] field6351;
   @OriginalMember(
      owner = "client!lba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6363 = new String[]{method3279(method3278("P8Fxp\u0014")), method3279(method3278("P8Fxt\u0014")), method3279(method3278("P8Fxv\u0014")), method3279(method3278("\u007f;IvZR6^vGY.U?PJ?\u00077\u0015Z/K:\u0015U7F1P\u001c9F5]Y")), method3279(method3278("P8Fx\tU4N\"\u000b\u0014")), method3279(method3278("P8Fxw\u0014")), method3279(method3278("Gt\txH")), method3279(method3278("R/K:")), method3279(method3278("P8Fxq\u0014")), method3279(method3278("P8Fxs\u0014")), method3279(method3278("P8Fxr\u0014")), method3279(method3278("U3F"))};
   @OriginalMember(
      owner = "client!lba",
      name = "f",
      descriptor = "Lnaa;"
   )
   public static class113 field6356 = new class113(24, 7);
   @OriginalMember(
      owner = "client!lba",
      name = "j",
      descriptor = "I"
   )
   public static int field6360 = 4;
   @OriginalMember(
      owner = "client!lba",
      name = "l",
      descriptor = "I"
   )
   public static int field6348;
   @OriginalMember(
      owner = "client!lba",
      name = "c",
      descriptor = "I"
   )
   public static int field6352;
   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "I"
   )
   public static int field6355;
   @OriginalMember(
      owner = "client!lba",
      name = "k",
      descriptor = "I"
   )
   public static int field6358;
   @OriginalMember(
      owner = "client!lba",
      name = "b",
      descriptor = "I"
   )
   public static int field6359;
   @OriginalMember(
      owner = "client!lba",
      name = "n",
      descriptor = "I"
   )
   public static int field6362;

   @OriginalMember(
      owner = "client!lba",
      name = "b",
      descriptor = "(I)[[[I"
   )
   public final int[][][] method3271(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field6362;
         if (~this.field6350 != ~this.field6349) {
            throw new RuntimeException(field6363[3]);
         } else {
            if (arg0 != 12921) {
               method3274((byte)-121);
            }

            int var3 = 0;
            if (var2) {
               this.field6357[var3] = class146.field2073;
               ++var3;
            }

            while(true) {
               class408 var10000;
               if (var3 >= this.field6350) {
                  var10000 = this;
                  if (!var2) {
                     return this.field6351;
                  }
               } else {
                  var10000 = this;
               }

               var10000.field6357[var3] = class146.field2073;
               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6363[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(Z[BI)Ljava/lang/Object;"
   )
   public static final Object method3272(boolean arg0, byte[] arg1, int arg2) {
      try {
         ++field6355;
         if (arg1 == null) {
            return null;
         } else {
            if (arg2 != 0) {
               method3273(true, -61, -128, true, 65, (class374[])null);
            }

            if (~arg1.length < -137 && !class703.field10590) {
               try {
                  class306 var3 = (class306)Class.forName(field6363[11]).newInstance();
                  var3.method2566(true, arg1);
                  return var3;
               } catch (Throwable var5) {
                  class703.field10590 = true;
               }
            }

            return arg0 ? class571.method4297(-97, arg1) : arg1;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field6363[10] + arg0 + ',' + (arg1 != null ? field6363[6] : field6363[7]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(ZIIZI[Lfq;)V"
   )
   public static final void method3273(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, class374[] arg5) {
      try {
         ++field6359;
         if (!arg0) {
            for(int var6 = 0; ~arg5.length < ~var6; ++var6) {
               class374 var7 = arg5[var6];
               if (var7 != null && ~var7.field5830 == ~arg4) {
                  class718.method5315(arg1, arg2, arg3, var7, 6227);
                  class531.method4074(var7, arg1, arg2, (byte)-105);
                  if (~(var7.field5951 - var7.field5849) > ~var7.field5809) {
                     var7.field5809 = -var7.field5849 + var7.field5951;
                  }

                  if (var7.field5812 > -var7.field5915 + var7.field5942) {
                     var7.field5812 = var7.field5942 - var7.field5915;
                  }

                  if (~var7.field5809 > -1) {
                     var7.field5809 = 0;
                  }

                  if (var7.field5812 < 0) {
                     var7.field5812 = 0;
                  }

                  if (~var7.field5910 == -1) {
                     class127.method1197(false, arg3, var7);
                  }
               }
            }

         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field6363[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field6363[6] : field6363[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3274(byte arg0) {
      try {
         if (arg0 >= -37) {
            method3274((byte)51);
         }

         field6356 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6363[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3275(int arg0) {
      boolean var2 = client.field1786;

      try {
         int var3 = 0;
         if (var2) {
            this.field6351[var3][0] = null;
            this.field6351[var3][1] = null;
            this.field6351[var3][2] = null;
            this.field6351[var3] = null;
            ++var3;
         }

         while(true) {
            while(~var3 > ~this.field6350) {
               this.field6351[var3][0] = null;
               this.field6351[var3][1] = null;
               this.field6351[var3][2] = null;
               this.field6351[var3] = null;
               ++var3;
            }

            ++field6348;
            this.field6357 = null;
            this.field6351 = null;
            this.field6347.method4981((byte)-86);
            this.field6347 = null;
            if (!var2) {
               if (arg0 != -11950) {
                  this.field6349 = -37;
                  return;
               }

               return;
            }

            ++var3;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6363[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(BI)[[I"
   )
   public final int[][] method3276(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         if (arg0 <= 88) {
            return null;
         } else {
            ++field6352;
            if (this.field6350 == this.field6349) {
               this.field6361 = this.field6357[arg1] == null;
               this.field6357[arg1] = class146.field2073;
               return this.field6351[arg1];
            } else if (~this.field6350 == -2) {
               this.field6361 = ~this.field6353 != ~arg1;
               this.field6353 = arg1;
               return this.field6351[0];
            } else {
               class733 var4;
               label43: {
                  var4 = this.field6357[arg1];
                  if (var4 == null) {
                     label40: {
                        this.field6361 = true;
                        if (this.field6350 <= this.field6354) {
                           class733 var5 = (class733)this.field6347.method4984((byte)-69);
                           var4 = new class733(arg1, var5.field10925);
                           this.field6357[var5.field10929] = null;
                           var5.method2477(1976);
                           if (!var3) {
                              break label40;
                           }
                        }

                        var4 = new class733(arg1, this.field6354);
                        ++this.field6354;
                     }

                     this.field6357[arg1] = var4;
                     if (!var3) {
                        break label43;
                     }
                  }

                  this.field6361 = false;
               }

               this.field6347.method4983(-17121, var4);
               return this.field6351[var4.field10925];
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field6363[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(II)I"
   )
   public static int method3277(int arg0, int arg1) {
      try {
         return arg0 & arg1;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6363[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "<init>",
      descriptor = "(III)V"
   )
   public class408(int arg0, int arg1, int arg2) {
      try {
         this.field6349 = arg1;
         this.field6350 = arg0;
         this.field6357 = new class733[this.field6349];
         this.field6351 = new int[this.field6350][3][arg2];
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field6363[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3278(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3279(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
