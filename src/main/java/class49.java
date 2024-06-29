import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class49 {
   @OriginalMember(
      owner = "client!gs",
      name = "i",
      descriptor = "Ldr;"
   )
   public class750 field593 = new class750();
   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field600 = new String[]{method400(method399("\u0007\u001d\u001be6\u000e\u0007Agw")), method400(method399("\u0007\u001d\u001b\u001cw")), method400(method399("\u0007\u001d\u001b\u001ew")), method400(method399("\u000e\u001bY5")), method400(method399("\u001b@\u001bw\"")), method400(method399("\u0007\u001d\u001b\u001aw")), method400(method399("\u0007\u001d\u001b\u001bw")), method400(method399("\u0007\u001d\u001b\u001dw")), method400(method399("\u0007\u001d\u001b\u001fw")), method400(method399("\u0007\u001d\u001b\u0013w")), method400(method399("\u0007\u001d\u001b\u0010w")), method400(method399("\u0007\u001d\u001b\u0018w")), method400(method399("\u0007\u001d\u001b\u0011w"))};
   @OriginalMember(
      owner = "client!gs",
      name = "j",
      descriptor = "I"
   )
   public static int field595 = -1;
   @OriginalMember(
      owner = "client!gs",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field587 = new int[1000];
   @OriginalMember(
      owner = "client!gs",
      name = "l",
      descriptor = "I"
   )
   public static int field588;
   @OriginalMember(
      owner = "client!gs",
      name = "e",
      descriptor = "I"
   )
   public static int field589;
   @OriginalMember(
      owner = "client!gs",
      name = "c",
      descriptor = "I"
   )
   public static int field590;
   @OriginalMember(
      owner = "client!gs",
      name = "g",
      descriptor = "I"
   )
   public static int field591;
   @OriginalMember(
      owner = "client!gs",
      name = "m",
      descriptor = "I"
   )
   public static int field592;
   @OriginalMember(
      owner = "client!gs",
      name = "f",
      descriptor = "I"
   )
   public static int field594;
   @OriginalMember(
      owner = "client!gs",
      name = "h",
      descriptor = "I"
   )
   public static int field597;
   @OriginalMember(
      owner = "client!gs",
      name = "k",
      descriptor = "I"
   )
   public static int field598;
   @OriginalMember(
      owner = "client!gs",
      name = "d",
      descriptor = "I"
   )
   public static int field599;
   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "Ldr;"
   )
   private class750 field596;

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(B)Ldr;"
   )
   public final class750 method389(byte arg0) {
      try {
         ++field597;
         class750 var2 = this.field593.field11109;
         if (this.field593 == var2) {
            this.field596 = null;
            return null;
         } else {
            this.field596 = var2.field11109;
            return arg0 > -72 ? null : var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field600[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(IB)[I"
   )
   public static final int[] method390(int arg0, byte arg1) {
      try {
         ++field592;
         int[] var2 = new int[3];
         int var3 = 99 % ((arg1 - -35) / 60);
         class500.method3735(class458.method3441((byte)95, arg0), (byte)-92);
         var2[0] = class447.field6798.get(5);
         var2[1] = class447.field6798.get(2);
         var2[2] = class447.field6798.get(1);
         return var2;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field600[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(Lmr;I[[B)V"
   )
   public static final void method391(class153 param0, int param1, byte[][] param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method392(int arg0, int arg1, int arg2) {
      try {
         ++field588;
         if (arg2 != 1000) {
            field587 = null;
         }

         return class216.method1636(arg0, 0, arg1) || class625.method4509(arg1, arg0, true);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field600[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method393(byte arg0) {
      try {
         field587 = null;
         int var1 = 91 % ((29 - arg0) / 38);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field600[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method394(int arg0) {
      int var2 = client.field4530;

      try {
         if (arg0 != 1945546785) {
            field595 = 33;
         }

         ++field589;

         while(true) {
            class750 var3 = this.field593.field11109;
            if (this.field593 != var3) {
               var3.method5468(true);
               if (var2 != 0) {
                  break;
               }

               if (var2 == 0) {
                  continue;
               }
            }

            this.field596 = null;
            break;
         }

      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field600[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(ILdr;)V"
   )
   public final void method395(int arg0, class750 arg1) {
      try {
         ++field598;
         if (arg1.field11108 != null) {
            arg1.method5468(true);
         }

         arg1.field11109 = this.field593;
         arg1.field11108 = this.field593.field11108;
         arg1.field11108.field11109 = arg1;
         if (arg0 == -25224) {
            arg1.field11109.field11108 = arg1;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field600[7] + arg0 + ',' + (arg1 != null ? field600[4] : field600[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method396(boolean arg0) {
      try {
         if (arg0) {
            field595 = -38;
         }

         ++field591;
         class748 var1 = class402.field6170;
         synchronized(class402.field6170) {
            class402.field6170.method5445(697465426);
         }

         class748 var2 = class134.field1713;
         synchronized(class134.field1713) {
            class134.field1713.method5445(697465426);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field600[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "<init>",
      descriptor = "()V"
   )
   public class49() {
      try {
         this.field593.field11108 = this.field593;
         this.field593.field11109 = this.field593;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field600[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(I)Ldr;"
   )
   public final class750 method397(int arg0) {
      try {
         ++field590;
         class750 var2 = this.field596;
         if (this.field593 == var2) {
            this.field596 = null;
            return null;
         } else {
            this.field596 = var2.field11109;
            if (arg0 != 0) {
               this.field593 = null;
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field600[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method398(byte arg0) {
      int var2 = client.field4530;

      try {
         ++field599;
         if (arg0 != 117) {
            field595 = 98;
         }

         int var3 = 0;
         class750 var4 = this.field593.field11109;
         if (var2 != 0) {
            ++var3;
            var4 = var4.field11109;
         }

         while(true) {
            if (this.field593 == var4) {
               if (var2 == 0) {
                  return var3;
               }
            } else {
               ++var3;
            }

            var4 = var4.field11109;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field600[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method399(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 95);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method400(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 95;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
