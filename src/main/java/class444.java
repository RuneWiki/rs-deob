import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mja")
public class class444 {
   @OriginalMember(
      owner = "client!mja",
      name = "h",
      descriptor = "Loi;"
   )
   public class80 field6318 = new class80(20);
   @OriginalMember(
      owner = "client!mja",
      name = "o",
      descriptor = "Loi;"
   )
   private class80 field6326 = new class80(64);
   @OriginalMember(
      owner = "client!mja",
      name = "e",
      descriptor = "Lkf;"
   )
   private class266 field6325;
   @OriginalMember(
      owner = "client!mja",
      name = "m",
      descriptor = "Lkf;"
   )
   public class266 field6313;
   @OriginalMember(
      owner = "client!mja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6327 = new String[]{method3268(method3267("\u001f&:q.Z")), method3268(method3267("\u001f&:q,Z")), method3268(method3267("\u001f&:q$Z")), method3268(method3267("\u001f&:q%Z")), method3268(method3267("\u001f&:q(Z")), method3268(method3267("\u001f&:q)Z")), method3268(method3267("\u001f&:q+Z")), method3268(method3267("\u001c973")), method3268(method3267("\tbuq\u0010")), method3268(method3267("\u001f&:q/Z")), method3268(method3267("\u001f&:q*Z")), method3268(method3267("\u001f&:qQ\u001b\"2+SZ"))};
   @OriginalMember(
      owner = "client!mja",
      name = "b",
      descriptor = "I"
   )
   public static int field6315 = 0;
   @OriginalMember(
      owner = "client!mja",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field6311 = true;
   @OriginalMember(
      owner = "client!mja",
      name = "p",
      descriptor = "I"
   )
   public static int field6324 = 0;
   @OriginalMember(
      owner = "client!mja",
      name = "g",
      descriptor = "I"
   )
   public static int field6312;
   @OriginalMember(
      owner = "client!mja",
      name = "d",
      descriptor = "I"
   )
   public static int field6314;
   @OriginalMember(
      owner = "client!mja",
      name = "l",
      descriptor = "I"
   )
   public static int field6316;
   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "I"
   )
   public static int field6317;
   @OriginalMember(
      owner = "client!mja",
      name = "j",
      descriptor = "I"
   )
   public static int field6319;
   @OriginalMember(
      owner = "client!mja",
      name = "n",
      descriptor = "I"
   )
   public static int field6320;
   @OriginalMember(
      owner = "client!mja",
      name = "k",
      descriptor = "I"
   )
   public static int field6321;
   @OriginalMember(
      owner = "client!mja",
      name = "i",
      descriptor = "I"
   )
   public static int field6322;
   @OriginalMember(
      owner = "client!mja",
      name = "f",
      descriptor = "I"
   )
   public static int field6323;

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3258(byte arg0) {
      try {
         class541.field7769.method715(true);
         int var1 = -95 / ((arg0 - 85) / 32);
         ++field6316;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6327[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3259(int arg0) {
      try {
         ++field6320;
         if (arg0 != -16561) {
            this.method3264(false, 1);
         }

         class80 var2 = this.field6326;
         synchronized(this.field6326) {
            this.field6326.method731(0);
         }

         class80 var3 = this.field6318;
         synchronized(this.field6318) {
            this.field6318.method731(0);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field6327[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(ILkf;B)Lpj;"
   )
   public static final class158 method3260(int arg0, class266 arg1, byte arg2) {
      try {
         ++field6317;
         if (arg2 != 116) {
            method3260(-76, (class266)null, (byte)-6);
         }

         byte[] var3 = arg1.method2061((byte)93, arg0);
         return var3 == null ? null : new class158(var3);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6327[9] + arg0 + ',' + (arg1 != null ? field6327[8] : field6327[7]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(IB)Ll;"
   )
   public final class20 method3261(int arg0, byte arg1) {
      try {
         ++field6312;
         class80 var3 = this.field6326;
         class20 var4;
         synchronized(this.field6326) {
            var4 = (class20)this.field6326.method725(0, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class266 var5 = this.field6325;
            byte[] var6;
            synchronized(this.field6325) {
               var6 = this.field6325.method2037(false, arg0, 46);
            }

            class20 var7 = new class20();
            var7.field235 = this;
            if (var6 != null) {
               var7.method121(new class147(var6), (byte)-113);
            }

            class80 var8 = this.field6326;
            synchronized(this.field6326) {
               if (arg1 < 93) {
                  this.field6318 = null;
               }

               this.field6326.method723(0, (long)arg0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field6327[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(JIII)V"
   )
   public static final void method3262(long arg0, int arg1, int arg2, int arg3) {
      try {
         ++field6323;
         if (arg3 == -3) {
            int var5 = (int)arg0 >> 14 & 31;
            int var6 = (4002457 & (int)arg0) >> 20;
            int var7 = Integer.MAX_VALUE & (int)(arg0 >>> 32);
            if (var5 != 10 && ~var5 != -12 && var5 != 22) {
               class53.method418(true, 0, 0, arg2, arg1, 0, (byte)-108, var5, var6);
            } else {
               class259 var8;
               int var9;
               int var10;
               label44: {
                  var8 = class387.field5618.method3977(var7, (byte)75);
                  if (~var6 == -1 || ~var6 == -3) {
                     var9 = var8.field3595;
                     var10 = var8.field3583;
                     if (!client.field4360) {
                        break label44;
                     }
                  }

                  var10 = var8.field3595;
                  var9 = var8.field3583;
               }

               int var11 = var8.field3515;
               if (var6 != 0) {
                  var11 = (var11 >> 4 - var6) + (var11 << var6 & 15);
               }

               class53.method418(true, var10, var9, arg2, arg1, var11, (byte)108, 0, 0);
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field6327[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method3263(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4360;

      try {
         int var4;
         int var7;
         label110: {
            ++field6314;
            var4 = class467.field6723.method1635(class180.field2503.method1437(class608.field8920, arg0 ^ 50), (byte)-81);
            int var10000;
            if (class662.field9649) {
               byte var10001;
               label102: {
                  class598 var5 = (class598)class265.field3654.method3488((byte)-122);
                  if (var3) {
                     var10000 = var5.field8785;
                     var10001 = 1;
                  } else if (var5 == null) {
                     var4 += 8;
                     var7 = class578.field8529 * 16 + 21;
                     var10000 = class578.field8529 * 16;
                     var10001 = class743.field10822;
                     if (!var3) {
                        break label102;
                     }
                  } else {
                     var10000 = var5.field8785;
                     var10001 = 1;
                  }

                  while(true) {
                     int var6;
                     if (var10000 != var10001) {
                        var6 = class239.method1836(arg0 + -256, var5);
                        if (var3) {
                           var6 = class455.method3319((byte)115, (class32)var5.field8795.field6868.field950);
                        }
                     } else {
                        var6 = class455.method3319((byte)115, (class32)var5.field8795.field6868.field950);
                     }

                     if (var6 > var4) {
                        var4 = var6;
                     }

                     var5 = (class598)class265.field3654.method3484(arg0);
                     if (var5 == null) {
                        var4 += 8;
                        var7 = class578.field8529 * 16 + 21;
                        var10000 = class578.field8529 * 16;
                        var10001 = class743.field10822;
                        if (!var3) {
                           break;
                        }
                     } else {
                        var10000 = var5.field8785;
                        var10001 = 1;
                     }
                  }
               }

               class357.field4796 = var10000 - -(var10001 == 0 ? 22 : 26);
               if (!var3) {
                  break label110;
               }
            }

            label76: {
               class32 var8 = (class32)class627.field9216.method2933(2);
               if (var3) {
                  var10000 = class455.method3319((byte)115, var8);
               } else if (var8 == null) {
                  var10000 = class743.field10822;
                  if (!var3) {
                     break label76;
                  }
               } else {
                  var10000 = class455.method3319((byte)115, var8);
               }

               while(true) {
                  int var9 = var10000;
                  if (var9 > var4) {
                     var4 = var9;
                  }

                  var8 = (class32)class627.field9216.method2940(false);
                  if (var8 == null) {
                     var10000 = class743.field10822;
                     if (!var3) {
                        break;
                     }
                  } else {
                     var10000 = class455.method3319((byte)115, var8);
                  }
               }
            }

            class357.field4796 = (var10000 == 0 ? 22 : 26) + class278.field3784 * 16;
            var7 = class278.field3784 * 16 + 21;
            var4 += 8;
         }

         int var10 = -(var4 / 2) + arg1;
         if (~(var10 - -var4) < ~class237.field3310) {
            var10 = -var4 + class237.field3310;
         }

         if (var10 < 0) {
            var10 = 0;
         }

         int var11 = arg2;
         if (~class692.field10185 > ~(arg2 - -var7)) {
            var11 = -var7 + class692.field10185;
         }

         class185.field2624 = var10;
         if (arg0 > var11) {
            var11 = 0;
         }

         class285.field3949 = var4;
         class305.field4177 = var11;
         class131.field1677 = true;
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field6327[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method3264(boolean arg0, int arg1) {
      try {
         class80 var3 = this.field6326;
         synchronized(this.field6326) {
            if (!arg0) {
               this.method3264(false, 101);
            }

            this.field6326.method726(arg1, 25324);
         }

         ++field6322;
         class80 var4 = this.field6318;
         synchronized(this.field6318) {
            this.field6318.method726(arg1, 25324);
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field6327[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method3265(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mja",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3266(int arg0) {
      try {
         class80 var2 = this.field6326;
         synchronized(this.field6326) {
            this.field6326.method715(true);
         }

         ++field6321;
         if (arg0 < 30) {
            this.method3266(-90);
         }

         class80 var3 = this.field6318;
         synchronized(this.field6318) {
            this.field6318.method715(true);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field6327[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "<init>",
      descriptor = "(Lno;ILkf;Lkf;)V"
   )
   public class444(class732 arg0, int arg1, class266 arg2, class266 arg3) {
      try {
         this.field6325 = arg2;
         this.field6313 = arg3;
         this.field6325.method2060(2, 46);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field6327[11] + (arg0 != null ? field6327[8] : field6327[7]) + ',' + arg1 + ',' + (arg2 != null ? field6327[8] : field6327[7]) + ',' + (arg3 != null ? field6327[8] : field6327[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3267(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3268(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 76;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
