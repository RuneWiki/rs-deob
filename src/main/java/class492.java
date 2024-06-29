import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class492 {
   @OriginalMember(
      owner = "client!jba",
      name = "j",
      descriptor = "Lom;"
   )
   private class722 field7023;
   @OriginalMember(
      owner = "client!jba",
      name = "m",
      descriptor = "I"
   )
   private int field7026;
   @OriginalMember(
      owner = "client!jba",
      name = "l",
      descriptor = "I"
   )
   private int field7019;
   @OriginalMember(
      owner = "client!jba",
      name = "i",
      descriptor = "Lbga;"
   )
   private class398 field7016;
   @OriginalMember(
      owner = "client!jba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7030 = new String[]{method3743(method3742("\u001f\u0003p x]")), method3743(method3742("\u001f\u0003p p]")), method3743(method3742("\u001f\u0003p \u0005\u001c\u000fxz\u0007]")), method3743(method3742("\u001f\u0003p u]")), method3743(method3742("\u001f\u0003p q]")), method3743(method3742("\u001f\u0003p {]")), method3743(method3742("\u001f\u0003p ~]")), method3743(method3742("\u001f\u0003p z]")), method3743(method3742("\u001b\u0014}b")), method3743(method3742("\u001f\u0003p }]")), method3743(method3742("\u000eO? D")), method3743(method3742("\u001f\u0003p t]")), method3743(method3742("\u001f\u0003p \u007f]")), method3743(method3742("\u0006_r}")), method3743(method3742("\u001f\u0003p r]")), method3743(method3742("\u001f\u0003p s]")), method3743(method3742("\u001f\u0003p |]"))};
   @OriginalMember(
      owner = "client!jba",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   public static String field7022 = "";
   @OriginalMember(
      owner = "client!jba",
      name = "s",
      descriptor = "I"
   )
   public static int field7011;
   @OriginalMember(
      owner = "client!jba",
      name = "n",
      descriptor = "I"
   )
   public static int field7012;
   @OriginalMember(
      owner = "client!jba",
      name = "g",
      descriptor = "I"
   )
   public static int field7013;
   @OriginalMember(
      owner = "client!jba",
      name = "d",
      descriptor = "I"
   )
   public static int field7014;
   @OriginalMember(
      owner = "client!jba",
      name = "p",
      descriptor = "I"
   )
   public static int field7015;
   @OriginalMember(
      owner = "client!jba",
      name = "k",
      descriptor = "I"
   )
   public static int field7018;
   @OriginalMember(
      owner = "client!jba",
      name = "r",
      descriptor = "I"
   )
   public static int field7021;
   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "I"
   )
   public static int field7024;
   @OriginalMember(
      owner = "client!jba",
      name = "q",
      descriptor = "I"
   )
   public static int field7025;
   @OriginalMember(
      owner = "client!jba",
      name = "e",
      descriptor = "I"
   )
   public static int field7027;
   @OriginalMember(
      owner = "client!jba",
      name = "h",
      descriptor = "I"
   )
   public static int field7028;
   @OriginalMember(
      owner = "client!jba",
      name = "c",
      descriptor = "I"
   )
   public static int field7029;
   @OriginalMember(
      owner = "client!jba",
      name = "f",
      descriptor = "Lsa;"
   )
   public static class39 field7020;
   @OriginalMember(
      owner = "client!jba",
      name = "o",
      descriptor = "[Lie;"
   )
   public static class639[] field7017;

   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "(ILqga;)V"
   )
   private final void method3729(int arg0, class657 arg1) {
      try {
         if (arg1 != null) {
            arg1.method2140((byte)124);
            arg1.method962(false);
            this.field7019 += arg1.field9289;
         }

         ++field7013;
         if (arg0 != 0) {
            this.method3731((class250)null, 60);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7030[9] + arg0 + ',' + (arg1 != null ? field7030[10] : field7030[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3730(int arg0) {
      try {
         field7020 = null;
         if (arg0 != 27799) {
            field7022 = null;
         }

         field7017 = null;
         field7022 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7030[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "(Lhh;I)Ljava/lang/Object;"
   )
   public final Object method3731(class250 arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field7021;
         long var4 = arg0.method2159(-67);
         if (arg1 != 0) {
            return null;
         } else {
            class657 var6;
            Object var7;
            label69: {
               var6 = (class657)this.field7016.method3101(-1, var4);
               if (var3) {
                  if (var6.field9291.method2158((byte)-89, arg0)) {
                     var7 = var6.method3607(12);
                     if (var7 != null) {
                        break label69;
                     }

                     var6.method2140((byte)86);
                     var6.method962(false);
                     this.field7019 += var6.field9289;
                     if (var3) {
                        break label69;
                     }
                  }

                  var6 = (class657)this.field7016.method3103(arg1);
               }

               label68:
               while(true) {
                  while(var6 != null) {
                     if (var6.field9291.method2158((byte)-89, arg0)) {
                        var7 = var6.method3607(12);
                        if (var7 != null) {
                           break label68;
                        }

                        var6.method2140((byte)86);
                        var6.method962(false);
                        this.field7019 += var6.field9289;
                        if (var3) {
                           break label68;
                        }
                     }

                     var6 = (class657)this.field7016.method3103(arg1);
                  }

                  if (!var3) {
                     return null;
                  }

                  var6 = (class657)this.field7016.method3103(arg1);
               }
            }

            if (var6.method3608(14336)) {
               class614 var8 = new class614(arg0, var7, var6.field9289);
               this.field7016.method3098(var6.field3777, var8, arg1 + -1);
               this.field7023.method5224(var8, arg1 ^ 85);
               var8.field1548 = 0L;
               var6.method2140((byte)-101);
               var6.method962(false);
               if (!var3) {
                  return var7;
               }
            }

            this.field7023.method5224(var6, arg1 + 100);
            var6.field1548 = 0L;
            return var7;
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field7030[15] + (arg0 != null ? field7030[10] : field7030[8]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method3732(int arg0) {
      try {
         if (arg0 == -1) {
            ++field7029;
            this.field7023.method5222((byte)-63);
            this.field7016.method3096(-121);
            this.field7019 = this.field7026;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7030[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method3733(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field7011;
         int var2 = class274.field4182;
         int[] var3 = class124.field1983;
         int var4 = arg0;
         if (var1 || arg0 < var2) {
            do {
               class158 var5 = class501.field7137[var3[var4]];
               if (var5 != null && var5.field5817 > 0) {
                  --var5.field5817;
                  if (var5.field5817 == 0) {
                     var5.field5811 = null;
                  }
               }

               ++var4;
            } while(var4 < var2);
         }

         int var6 = 0;
         if (var1 || class261.field3995 > var6) {
            do {
               long var7 = (long)class344.field5068[var6];
               class432 var9 = (class432)class573.field8110.method3101(-1, var7);
               if (var9 != null) {
                  class799 var10 = var9.field6345;
                  if (~var10.field5817 < -1) {
                     --var10.field5817;
                     if (var10.field5817 == 0) {
                        var10.field5811 = null;
                     }
                  }
               }

               ++var6;
            } while(class261.field3995 > var6);

         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field7030[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method3734(int param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "(Lhh;IZLjava/lang/Object;)V"
   )
   private final void method3735(class250 arg0, int arg1, boolean arg2, Object arg3) {
      boolean var5 = client.field10022;

      try {
         ++field7018;
         if (this.field7026 < arg1) {
            throw new IllegalStateException(field7030[13]);
         } else {
            this.method3737((byte)-127, arg0);
            this.field7019 -= arg1;
            class657 var6;
            if (var5) {
               var6 = (class657)this.field7023.method5229((byte)-126);
               this.method3729(0, var6);
            }

            while(true) {
               while(this.field7019 < 0) {
                  var6 = (class657)this.field7023.method5229((byte)-126);
                  this.method3729(0, var6);
               }

               class614 var9 = new class614(arg0, arg3, arg1);
               this.field7016.method3098(arg0.method2159(-57), var9, -1);
               if (!var5) {
                  if (!arg2) {
                     this.field7019 = -83;
                  }

                  this.field7023.method5224(var9, 89);
                  var9.field1548 = 0L;
                  return;
               }

               this.method3729(0, var9);
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field7030[14] + (arg0 != null ? field7030[10] : field7030[8]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7030[10] : field7030[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3736(int arg0) {
      try {
         if (arg0 != -9560) {
            this.field7019 = 121;
         }

         ++field7027;
         return this.field7026;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7030[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "(BLhh;)V"
   )
   private final void method3737(byte param1, class250 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3738(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "(Ljava/lang/Object;ILhh;)V"
   )
   public final void method3739(Object arg0, int arg1, class250 arg2) {
      try {
         this.method3735(arg2, 1, true, arg0);
         int var4 = -71 / ((arg1 - -11) / 56);
         ++field7015;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7030[12] + (arg0 != null ? field7030[10] : field7030[8]) + ',' + arg1 + ',' + (arg2 != null ? field7030[10] : field7030[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method3740(int arg0) {
      try {
         ++field7024;
         if (arg0 < 29) {
            field7017 = null;
         }

         return this.field7019;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7030[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method3741(int arg0) {
      try {
         int var1 = -47 % ((-52 - arg0) / 50);
         ++field7014;
         if (class436.field6382 != null) {
            class799.method5762(-2619, class585.field8203);
         } else if (~class777.field11335 == 0) {
            class215.method1855(field7022, class226.field3216, -112, class585.field8203);
         } else {
            class472.method3614(class585.field8203, 3);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7030[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class492(int arg0) {
      boolean var2 = client.field10022;
      super();
      this.field7023 = new class722();

      try {
         this.field7026 = arg0;
         this.field7019 = arg0;
         int var3 = 1;
         if (var2) {
            var3 += var3;
         }

         while(~arg0 < ~(var3 + var3)) {
            var3 += var3;
         }

         this.field7016 = new class398(var3);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7030[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3742(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3743(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
