import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class628 extends class742 {
   @OriginalMember(
      owner = "client!qs",
      name = "A",
      descriptor = "I"
   )
   public int field9130 = 0;
   @OriginalMember(
      owner = "client!qs",
      name = "V",
      descriptor = "I"
   )
   public int field9129 = -1;
   @OriginalMember(
      owner = "client!qs",
      name = "ab",
      descriptor = "I"
   )
   public int field9125 = -1;
   @OriginalMember(
      owner = "client!qs",
      name = "M",
      descriptor = "I"
   )
   private int field9134 = 0;
   @OriginalMember(
      owner = "client!qs",
      name = "K",
      descriptor = "Z"
   )
   private boolean field9145 = false;
   @OriginalMember(
      owner = "client!qs",
      name = "fb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9149 = new String[]{method4530(method4529("}$3\t")), method4530(method4529("b\"q1Q")), method4530(method4529("h\u007fqK\u0004")), method4530(method4529("b\"q4Q")), method4530(method4529("b\"q-8;")), method4530(method4529("b\"q)Q")), method4530(method4529("b\"q#8;")), method4530(method4529("b\"q5Q")), method4530(method4529("b\"q\"8;")), method4530(method4529("b\"q 8;")), method4530(method4529("b\"q.Q")), method4530(method4529("b\"q3Q")), method4530(method4529("b\"q+Q"))};
   @OriginalMember(
      owner = "client!qs",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field9132 = new String[100];
   @OriginalMember(
      owner = "client!qs",
      name = "P",
      descriptor = "Lnn;"
   )
   public static class436 field9128 = new class436(method4530(method4529("Z\u001f\u000b'<G\u0010")), method4530(method4529("|79\f\u001av")), method4530(method4529("L81\u0011\u001bv%>")), 6);
   @OriginalMember(
      owner = "client!qs",
      name = "I",
      descriptor = "Lsd;"
   )
   public static class101 field9147 = new class101(43, 12);
   @OriginalMember(
      owner = "client!qs",
      name = "W",
      descriptor = "I"
   )
   public static int field9126;
   @OriginalMember(
      owner = "client!qs",
      name = "J",
      descriptor = "I"
   )
   public int field9127;
   @OriginalMember(
      owner = "client!qs",
      name = "N",
      descriptor = "I"
   )
   public int field9133;
   @OriginalMember(
      owner = "client!qs",
      name = "bb",
      descriptor = "I"
   )
   public static int field9135;
   @OriginalMember(
      owner = "client!qs",
      name = "T",
      descriptor = "I"
   )
   public static int field9137;
   @OriginalMember(
      owner = "client!qs",
      name = "R",
      descriptor = "I"
   )
   public int field9138;
   @OriginalMember(
      owner = "client!qs",
      name = "Y",
      descriptor = "I"
   )
   public static int field9139;
   @OriginalMember(
      owner = "client!qs",
      name = "X",
      descriptor = "I"
   )
   public int field9140;
   @OriginalMember(
      owner = "client!qs",
      name = "U",
      descriptor = "I"
   )
   public static int field9141;
   @OriginalMember(
      owner = "client!qs",
      name = "eb",
      descriptor = "I"
   )
   public static int field9142;
   @OriginalMember(
      owner = "client!qs",
      name = "S",
      descriptor = "I"
   )
   public static int field9143;
   @OriginalMember(
      owner = "client!qs",
      name = "Z",
      descriptor = "I"
   )
   public static int field9144;
   @OriginalMember(
      owner = "client!qs",
      name = "cb",
      descriptor = "I"
   )
   public static int field9146;
   @OriginalMember(
      owner = "client!qs",
      name = "O",
      descriptor = "I"
   )
   public static int field9148;
   @OriginalMember(
      owner = "client!qs",
      name = "db",
      descriptor = "Ljava/awt/Frame;"
   )
   public static Frame field9136;
   @OriginalMember(
      owner = "client!qs",
      name = "Q",
      descriptor = "[I"
   )
   public static int[] field9131;

   @OriginalMember(
      owner = "client!qs",
      name = "c",
      descriptor = "(B)I",
      line = 4
   )
   public final int method1282(byte arg0) {
      try {
         ++field9141;
         class91 var2 = class54.field616.method1689(this.field9133, (byte)99);
         int var3 = var2.field1165;
         if (arg0 != 5) {
            return -14;
         } else {
            if (~this.field9129 != 0) {
               class91 var4 = class54.field616.method1689(this.field9129, (byte)98);
               if (var4.field1165 > var3) {
                  var3 = var4.field1165;
               }
            }

            if (~this.field9125 != 0) {
               class91 var5 = class54.field616.method1689(this.field9125, (byte)94);
               if (var3 < var5.field1165) {
                  var3 = var5.field1165;
               }
            }

            return var3;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field9149[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(I)V",
      line = 39
   )
   public static void method4527(int arg0) {
      try {
         field9132 = null;
         field9128 = null;
         field9136 = null;
         field9147 = null;
         field9131 = null;
         if (arg0 != 0) {
            field9147 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9149[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(Lha;I)Lvw;",
      line = 54
   )
   public final class319 method10(class66 arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field9148;
         class389 var4 = class717.method5186(super.field9010, super.field9003 >> class459.field6950, super.field9007 >> class459.field6950);
         class249 var5 = class97.method856(super.field9010, super.field9003 >> class459.field6950, super.field9007 >> class459.field6950);
         int var6 = 0;
         if (var4 != null && var4.field5943.field10993) {
            var6 = var4.field5943.method11(0);
         }

         if (var5 != null && ~var5.field3334 < ~(-var6)) {
            var6 = -var5.field3334;
         }

         if (~this.field9130 != ~var6) {
            super.field8998 -= this.field9130;
            super.field8998 += var6;
            this.field9130 = var6;
         }

         class540 var7 = arg0.method659();
         var7.method1525();
         if (~this.field9130 == -1) {
            boolean var8 = false;
            boolean var9 = false;
            boolean var10 = false;
            class293 var11 = class377.field5711[super.field9005];
            int var12 = this.field9134 << 1;
            int var14 = -var12 / 2;
            int var15 = -var12 / 2;
            int var16 = var11.method2236((byte)114, super.field9003 + var14, super.field9007 + var15);
            int var17 = var12 / 2;
            int var18 = -var12 / 2;
            int var19 = var11.method2236((byte)120, super.field9003 + var17, super.field9007 + var18);
            int var20 = -var12 / 2;
            int var21 = var12 / 2;
            int var22 = var11.method2236((byte)124, super.field9003 + var20, super.field9007 + var21);
            int var23 = var12 / 2;
            int var24 = var12 / 2;
            int var25 = var11.method2236((byte)112, super.field9003 + var23, super.field9007 + var24);
            int var26 = var19 > var16 ? var16 : var19;
            int var27 = ~var22 <= ~var25 ? var25 : var22;
            int var28 = var19 < var25 ? var19 : var25;
            int var29 = ~var16 <= ~var22 ? var22 : var16;
            if (~var12 != -1) {
               int var30 = 16383 & (int)(Math.atan2((double)(var26 - var27), (double)var12) * 2607.5945876176133D);
               if (~var30 != -1) {
                  var7.method1531(var30);
               }
            }

            if (var12 != 0) {
               int var31 = (int)(Math.atan2((double)(-var28 + var29), (double)var12) * 2607.5945876176133D) & 16383;
               if (var31 != 0) {
                  var7.method1522(-var31);
               }
            }

            int var32 = var16 + var25;
            if (var19 - -var22 < var32) {
               var32 = var19 + var22;
            }

            int var33 = (var32 >> 1) + -super.field8998;
            if (var33 != 0) {
               var7.method1512(0, var33, 0);
            }
         }

         var7.method1512(super.field9003, super.field8998 + -10, super.field9007);
         class319 var34 = class487.method3611(true, (byte)-48, 3);
         this.field9134 = 0;
         this.field9145 = false;
         if (~this.field9125 != 0) {
            class497 var35 = class54.field616.method1689(this.field9125, (byte)81).method833(this.field9138, 0, -1, (byte)-67, 2048, arg0, (class676)null, (class131)null, 0);
            if (var35 != null) {
               label115: {
                  if (!class88.field1076) {
                     var35.method301(var7, var34.field4560[2], 0);
                     if (var3 == 0) {
                        break label115;
                     }
                  }

                  var35.method338(var7, var34.field4560[2], class221.field2828, 0);
               }

               this.field9145 |= var35.method295();
               this.field9134 = var35.method299();
            }
         }

         if (this.field9129 != arg1) {
            class497 var36 = class54.field616.method1689(this.field9129, (byte)-21).method833(this.field9140, 0, -1, (byte)79, 2048, arg0, (class676)null, (class131)null, 0);
            if (var36 != null) {
               label107: {
                  if (!class88.field1076) {
                     var36.method301(var7, var34.field4560[1], 0);
                     if (var3 == 0) {
                        break label107;
                     }
                  }

                  var36.method338(var7, var34.field4560[1], class221.field2828, 0);
               }

               this.field9145 |= var36.method295();
               if (~var36.method299() < ~this.field9134) {
                  this.field9134 = var36.method299();
               }
            }
         }

         class497 var37 = class54.field616.method1689(this.field9133, (byte)118).method833(this.field9127, 0, -1, (byte)104, 2048, arg0, (class676)null, (class131)null, 0);
         if (var37 != null) {
            label100: {
               if (!class88.field1076) {
                  var37.method301(var7, var34.field4560[0], 0);
                  if (var3 == 0) {
                     break label100;
                  }
               }

               var37.method338(var7, var34.field4560[0], class221.field2828, 0);
            }

            this.field9145 |= var37.method295();
            if (var37.method299() > this.field9134) {
               this.field9134 = var37.method299();
            }
         }

         return var34;
      } catch (RuntimeException var39) {
         throw class670.method4877(var39, field9149[9] + (arg0 != null ? field9149[2] : field9149[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "b",
      descriptor = "(Lha;I)V",
      line = 222
   )
   public final void method4(class66 arg0, int arg1) {
      try {
         if (arg1 != 50) {
            field9136 = null;
         }

         ++field9137;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9149[3] + (arg0 != null ? field9149[2] : field9149[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "k",
      descriptor = "(I)I",
      line = 233
   )
   public final int method11(int arg0) {
      try {
         ++field9143;
         return arg0 != 0 ? 118 : -10;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9149[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "<init>",
      descriptor = "(IIIII)V",
      line = 390
   )
   public class628(int arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!qs",
      name = "f",
      descriptor = "(I)I",
      line = 254
   )
   public final int method6(int arg0) {
      try {
         if (arg0 <= 44) {
            this.method5(118);
         }

         ++field9139;
         return this.field9134;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9149[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "h",
      descriptor = "(I)Z",
      line = 265
   )
   public final boolean method2(int arg0) {
      try {
         ++field9146;
         if (arg0 != -7577) {
            this.method16(-113, (class66)null);
         }

         return false;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9149[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "b",
      descriptor = "(ILha;)Lcka;",
      line = 278
   )
   public final class185 method16(int arg0, class66 arg1) {
      try {
         if (arg0 >= -114) {
            method4528(-72, (class446)null, -26, (class66)null, (class464)null, 69, (class426)null, -65, -125);
         }

         ++field9135;
         return null;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9149[5] + arg0 + ',' + (arg1 != null ? field9149[2] : field9149[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "j",
      descriptor = "(I)Z",
      line = 289
   )
   public final boolean method5(int arg0) {
      try {
         if (arg0 != -26787) {
            this.field9129 = 88;
         }

         ++field9142;
         return this.field9145;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field9149[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(IILha;I)Z",
      line = 302
   )
   public final boolean method20(int arg0, int arg1, class66 arg2, int arg3) {
      try {
         ++field9126;
         class540 var5 = arg2.method659();
         var5.method1530(super.field9003, super.field8998 + -10, super.field9007);
         class91 var6 = class54.field616.method1689(this.field9133, (byte)123);
         class497 var7 = var6.method833(this.field9127, 0, -1, (byte)82, arg1, arg2, (class676)null, (class131)null, 0);
         if (var7 != null && (class88.field1076 ? var7.method331(arg3, arg0, var5, true, var6.field1165, class221.field2828) : var7.method318(arg3, arg0, var5, true, var6.field1165))) {
            return true;
         } else {
            if (this.field9129 != -1) {
               class91 var8 = class54.field616.method1689(this.field9129, (byte)95);
               class497 var9 = var8.method833(this.field9140, 0, -1, (byte)127, 131072, arg2, (class676)null, (class131)null, 0);
               if (var9 != null && (!class88.field1076 ? var9.method318(arg3, arg0, var5, true, var8.field1165) : var9.method331(arg3, arg0, var5, true, var8.field1165, class221.field2828))) {
                  return true;
               }
            }

            if (this.field9125 != -1) {
               class91 var10 = class54.field616.method1689(this.field9125, (byte)86);
               class497 var11 = var10.method833(this.field9138, 0, -1, (byte)58, 131072, arg2, (class676)null, (class131)null, 0);
               if (var11 != null && (class88.field1076 ? var11.method331(arg3, arg0, var5, true, var10.field1165, class221.field2828) : var11.method318(arg3, arg0, var5, true, var10.field1165))) {
                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field9149[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9149[2] : field9149[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(ILad;ILha;Lti;ILhja;II)V",
      line = 347
   )
   public static final void method4528(int arg0, class446 arg1, int arg2, class66 arg3, class464 arg4, int arg5, class426 arg6, int arg7, int arg8) {
      int var9 = client.field4530;

      try {
         ++field9144;
         int var10 = -(arg0 / 2) + -5 + arg8;
         int var11 = arg5 - -2;
         if (~arg6.field6499 != -1) {
            arg3.method609(1, arg5 + 1 - (-(arg4.method3466() * arg7) - -var11), var10, arg0 + 10, var11, arg6.field6499);
         }

         if (arg6.field6486 != 0) {
            arg3.method637(var10, arg0 + 10, arg6.field6486, var11, 1, 1 + arg7 * arg4.method3466() + arg5 + -var11);
         }

         int var12 = arg6.field6488;
         if (arg1.field6779 && ~arg6.field6497 != 0) {
            var12 = arg6.field6497;
         }

         if (arg2 > 19) {
            int var13 = 0;
            if (var9 != 0 || arg7 > var13) {
               do {
                  String var14 = class288.field4046[var13];
                  if (arg7 + -1 > var13) {
                     var14 = var14.substring(0, var14.length() + -4);
                  }

                  arg4.method3465(arg3, var14, arg8, arg5, var12, true);
                  arg5 += arg4.method3466();
                  ++var13;
               } while(arg7 > var13);

            }
         }
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field9149[8] + arg0 + ',' + (arg1 != null ? field9149[2] : field9149[0]) + ',' + arg2 + ',' + (arg3 != null ? field9149[2] : field9149[0]) + ',' + (arg4 != null ? field9149[2] : field9149[0]) + ',' + arg5 + ',' + (arg6 != null ? field9149[2] : field9149[0]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4529(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 121);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4530(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 121;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
