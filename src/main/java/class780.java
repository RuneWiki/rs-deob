import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class780 implements class324 {
   @OriginalMember(
      owner = "client!nh",
      name = "d",
      descriptor = "I"
   )
   private int field11429 = 0;
   @OriginalMember(
      owner = "client!nh",
      name = "e",
      descriptor = "[Ljp;"
   )
   private class376[] field11446 = new class376[9];
   @OriginalMember(
      owner = "client!nh",
      name = "t",
      descriptor = "I"
   )
   private int field11451 = -1;
   @OriginalMember(
      owner = "client!nh",
      name = "f",
      descriptor = "Lea;"
   )
   private class573 field11434;
   @OriginalMember(
      owner = "client!nh",
      name = "s",
      descriptor = "I"
   )
   private int field11436;
   @OriginalMember(
      owner = "client!nh",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11452 = new String[]{method5628(method5627("\u0012ew\u0007\u0001")), method5628(method5627("\u0012ew\u0011\u0001")), method5628(method5627("\u0012ew\u0019\u0001")), method5628(method5627("\u0012ew\u001a\u0001")), method5628(method5627("\u0012ew\u0006\u0001")), method5628(method5627("\u0007#w{T")), method5628(method5627("\u0012ewi@\u0012d-k\u0001")), method5628(method5627("\u0012x59")), method5628(method5627("\u0012ew\u0010\u0001")), method5628(method5627("\u0012ew\u0013\u0001")), method5628(method5627("\u0012ew\u0018\u0001")), method5628(method5627("\u0012ew\u0012\u0001")), method5628(method5627("\u0012ew3@\u0012l5<S\u0019%")), method5628(method5627("\u0012ew\u001f\u0001")), method5628(method5627("\u0012ew\u001b\u0001")), method5628(method5627("\u0012ew\u0014\u0001")), method5628(method5627("\u0012ew\u0005\u0001")), method5628(method5627("\u0012ew\u0016\u0001")), method5628(method5627("\u0012ew\u001c\u0001")), method5628(method5627("\u0012ew\u0017\u0001")), method5628(method5627("\u0012ew\u0004\u0001")), method5628(method5627("\u0012ew\u001e\u0001"))};
   @OriginalMember(
      owner = "client!nh",
      name = "i",
      descriptor = "I"
   )
   public static int field11424;
   @OriginalMember(
      owner = "client!nh",
      name = "p",
      descriptor = "I"
   )
   public static int field11426;
   @OriginalMember(
      owner = "client!nh",
      name = "c",
      descriptor = "I"
   )
   public static int field11427;
   @OriginalMember(
      owner = "client!nh",
      name = "m",
      descriptor = "I"
   )
   public static int field11428;
   @OriginalMember(
      owner = "client!nh",
      name = "A",
      descriptor = "I"
   )
   public static int field11430;
   @OriginalMember(
      owner = "client!nh",
      name = "b",
      descriptor = "I"
   )
   public static int field11431;
   @OriginalMember(
      owner = "client!nh",
      name = "y",
      descriptor = "I"
   )
   public static int field11432;
   @OriginalMember(
      owner = "client!nh",
      name = "n",
      descriptor = "I"
   )
   public static int field11433;
   @OriginalMember(
      owner = "client!nh",
      name = "o",
      descriptor = "I"
   )
   public static int field11435;
   @OriginalMember(
      owner = "client!nh",
      name = "h",
      descriptor = "I"
   )
   public static int field11437;
   @OriginalMember(
      owner = "client!nh",
      name = "g",
      descriptor = "I"
   )
   public static int field11438;
   @OriginalMember(
      owner = "client!nh",
      name = "q",
      descriptor = "I"
   )
   private int field11439;
   @OriginalMember(
      owner = "client!nh",
      name = "z",
      descriptor = "I"
   )
   public static int field11440;
   @OriginalMember(
      owner = "client!nh",
      name = "j",
      descriptor = "I"
   )
   public static int field11441;
   @OriginalMember(
      owner = "client!nh",
      name = "v",
      descriptor = "I"
   )
   public static int field11442;
   @OriginalMember(
      owner = "client!nh",
      name = "u",
      descriptor = "I"
   )
   public static int field11443;
   @OriginalMember(
      owner = "client!nh",
      name = "B",
      descriptor = "I"
   )
   private int field11444;
   @OriginalMember(
      owner = "client!nh",
      name = "x",
      descriptor = "I"
   )
   public static int field11445;
   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "I"
   )
   public static int field11447;
   @OriginalMember(
      owner = "client!nh",
      name = "l",
      descriptor = "I"
   )
   public static int field11448;
   @OriginalMember(
      owner = "client!nh",
      name = "r",
      descriptor = "I"
   )
   public static int field11449;
   @OriginalMember(
      owner = "client!nh",
      name = "w",
      descriptor = "I"
   )
   private int field11450;
   @OriginalMember(
      owner = "client!nh",
      name = "k",
      descriptor = "Lfg;"
   )
   public static class140 field11425;

   @OriginalMember(
      owner = "client!nh",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method2402(boolean arg0) {
      try {
         ++field11426;
         OpenGL.glBindFramebufferEXT(36008, 0);
         this.field11429 &= -2;
         if (!arg0) {
            this.field11451 = this.method5621(-42);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11452[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(IILwfa;B)V"
   )
   public final void method5614(int arg0, int arg1, class212 arg2, byte arg3) {
      try {
         if (arg3 != 40) {
            this.field11429 = -65;
         }

         this.method5626(0, arg0, (byte)101, arg2, arg1);
         ++field11427;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11452[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11452[5] : field11452[7]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method5615(byte arg0) {
      try {
         if (arg0 < 86) {
            method5616(126, 78, -27);
         }

         field11425 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11452[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(III)Lkfa;"
   )
   public static final class629 method5616(int arg0, int arg1, int arg2) {
      class517 var3 = class663.field9659[arg0][arg1][arg2];
      if (var3 == null) {
         return null;
      } else {
         class629 var4 = var3.field7472;
         var3.field7472 = null;
         class32.method286(var4);
         return var4;
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2399(int arg0) {
      try {
         ++field11447;
         OpenGL.glBindFramebufferEXT(36160, this.field11436);
         if (arg0 == 31653) {
            this.field11429 |= 4;
            this.field11451 = this.method5621(-128);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11452[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field11448;
         this.field11434.method4161(this.field11436, true);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11452[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method5617(int arg0, int arg1) {
      try {
         ++field11424;
         int var3 = 74 / ((25 - arg1) / 38);
         if (this.field11446[arg0] != null) {
            this.field11446[arg0].method1678(0);
         }

         this.field11439 &= ~(1 << arg0);
         this.field11446[arg0] = null;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11452[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(ILjm;I)V"
   )
   public final void method5618(int arg0, class719 arg1, int arg2) {
      try {
         ++field11443;
         if (~this.field11451 == 0) {
            throw new RuntimeException();
         } else {
            if (arg0 != -1) {
               this.field11436 = -114;
            }

            int var4 = 1 << arg2;
            if (~(~var4 & this.field11439) != -1) {
               if (this.field11444 != arg1.field10499 || ~this.field11450 != ~arg1.field10507) {
                  throw new RuntimeException();
               }
            } else {
               this.field11444 = arg1.field10499;
               this.field11450 = arg1.field10507;
            }

            arg1.method5231(36161, class455.field6473[arg2], this.field11451);
            this.field11446[arg2] = arg1;
            this.field11439 |= var4;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11452[17] + arg0 + ',' + (arg1 != null ? field11452[5] : field11452[7]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method2400(byte arg0) {
      try {
         ++field11440;
         OpenGL.glBindFramebufferEXT(36009, 0);
         this.field11429 &= -3;
         if (arg0 >= -84) {
            method5615((byte)95);
         }

         this.field11451 = this.method5621(-99);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11452[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "d",
      descriptor = "(Z)Z"
   )
   public final boolean method5619(boolean arg0) {
      try {
         ++field11437;
         if (arg0) {
            this.field11434 = null;
         }

         int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field11451);
         return var2 == 36053;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11452[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2404(int arg0) {
      try {
         int var2 = -7 % ((arg0 - 32) / 60);
         OpenGL.glBindFramebufferEXT(36008, this.field11436);
         ++field11433;
         this.field11429 |= 1;
         this.field11451 = this.method5621(-120);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11452[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(BILbha;I)V"
   )
   private final void method5620(byte arg0, int arg1, class601 arg2, int arg3) {
      try {
         ++field11438;
         if (this.field11451 == -1) {
            throw new RuntimeException();
         } else if (arg0 == 75) {
            int var5 = 1 << arg3;
            if ((this.field11439 & ~var5) != 0) {
               if (this.field11444 != arg2.field8841 || this.field11450 != arg2.field8833) {
                  throw new RuntimeException();
               }
            } else {
               this.field11450 = arg2.field8833;
               this.field11444 = arg2.field8841;
            }

            arg2.method4374(class455.field6473[arg3], arg1, -106, this.field11451);
            this.field11446[arg3] = arg2;
            this.field11439 |= var5;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11452[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11452[5] : field11452[7]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "c",
      descriptor = "(I)I"
   )
   private final int method5621(int arg0) {
      try {
         ++field11430;
         if (~(this.field11429 & 4) != -1) {
            return 36160;
         } else if (~(2 & this.field11429) != -1) {
            return 36009;
         } else if ((1 & this.field11429) != 0) {
            return 36008;
         } else {
            if (arg0 >= -15) {
               this.method2404(111);
            }

            return -1;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11452[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method2403(boolean arg0) {
      try {
         OpenGL.glBindFramebufferEXT(36160, 0);
         ++field11432;
         this.field11429 &= -5;
         if (!arg0) {
            this.method5614(0, 29, (class212)null, (byte)-111);
         }

         this.field11451 = this.method5621(-99);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11452[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(ILbha;I)V"
   )
   public final void method5622(int arg0, class601 arg1, int arg2) {
      try {
         if (arg0 < 53) {
            this.method5619(false);
         }

         this.method5620((byte)75, 0, arg1, arg2);
         ++field11445;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11452[15] + arg0 + ',' + (arg1 != null ? field11452[5] : field11452[7]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method5623(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method5624(boolean arg0, int arg1) {
      try {
         if (arg0) {
            this.field11451 = -7;
         }

         ++field11442;
         if (~this.field11451 == 0) {
            throw new RuntimeException();
         } else {
            OpenGL.glReadBuffer(class455.field6473[arg1]);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11452[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method5625(int arg0, int arg1) {
      try {
         ++field11435;
         if (~this.field11451 == 0) {
            throw new RuntimeException();
         } else if (arg0 == -1) {
            OpenGL.glDrawBuffer(class455.field6473[arg1]);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11452[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method2401(boolean arg0) {
      try {
         ++field11441;
         OpenGL.glBindFramebufferEXT(36009, this.field11436);
         this.field11429 |= 2;
         if (!arg0) {
            this.field11446 = null;
         }

         this.field11451 = this.method5621(-111);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11452[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "a",
      descriptor = "(IIBLwfa;I)V"
   )
   private final void method5626(int arg0, int arg1, byte arg2, class212 arg3, int arg4) {
      try {
         ++field11431;
         if (this.field11451 == -1) {
            throw new RuntimeException();
         } else {
            int var6;
            label43: {
               var6 = 1 << arg1;
               if ((this.field11439 & ~var6) == 0) {
                  this.field11450 = arg3.field3028;
                  this.field11444 = arg3.field3028;
                  if (!client.field4360) {
                     break label43;
                  }
               }

               if (this.field11444 != arg3.field3028 || ~this.field11450 != ~arg3.field3028) {
                  throw new RuntimeException();
               }
            }

            arg3.method1676(arg0, 96, class455.field6473[arg1], arg4, this.field11451);
            this.field11446[arg1] = arg3;
            if (arg2 >= 47) {
               this.field11439 |= var6;
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field11452[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field11452[5] : field11452[7]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "<init>",
      descriptor = "(Lea;)V"
   )
   public class780(class573 arg0) {
      try {
         if (!arg0.field8445) {
            throw new IllegalStateException("");
         } else {
            this.field11434 = arg0;
            OpenGL.glGenFramebuffersEXT(1, class77.field961, 0);
            this.field11436 = class77.field961[0];
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11452[6] + (arg0 != null ? field11452[5] : field11452[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5627(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5628(char[] arg0) {
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
            var10005 = 13;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
