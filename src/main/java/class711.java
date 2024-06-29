import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class711 {
   @OriginalMember(
      owner = "client!jia",
      name = "b",
      descriptor = "Lsia;"
   )
   private class407 field10430 = new class407(64);
   @OriginalMember(
      owner = "client!jia",
      name = "p",
      descriptor = "Lsia;"
   )
   public class407 field10438 = new class407(50);
   @OriginalMember(
      owner = "client!jia",
      name = "i",
      descriptor = "Lsia;"
   )
   public class407 field10439 = new class407(5);
   @OriginalMember(
      owner = "client!jia",
      name = "n",
      descriptor = "Lww;"
   )
   private class339 field10426;
   @OriginalMember(
      owner = "client!jia",
      name = "g",
      descriptor = "Lkb;"
   )
   public class500 field10429;
   @OriginalMember(
      owner = "client!jia",
      name = "k",
      descriptor = "Z"
   )
   public boolean field10431;
   @OriginalMember(
      owner = "client!jia",
      name = "h",
      descriptor = "Lww;"
   )
   public class339 field10433;
   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10441 = new String[]{method5200(method5199(",&.\u001c\u000en")), method5200(method5199(",&.\u001c\bn")), method5200(method5199(",&.\u001c\u000fn")), method5200(method5199(",&.\u001c\tn")), method5200(method5199(",&.\u001c\u000bn")), method5200(method5199(",&.\u001c\nn")), method5200(method5199(",&.\u001c\u0005n")), method5200(method5199("=aa\u001c0")), method5200(method5199(",&.\u001cq/!&Fsn")), method5200(method5199("(:#^")), method5200(method5199(",&.\u001c\fn"))};
   @OriginalMember(
      owner = "client!jia",
      name = "d",
      descriptor = "Lcca;"
   )
   public static class729 field10425 = new class729(0, -1);
   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "I"
   )
   public static int field10427;
   @OriginalMember(
      owner = "client!jia",
      name = "l",
      descriptor = "I"
   )
   public static int field10428;
   @OriginalMember(
      owner = "client!jia",
      name = "e",
      descriptor = "I"
   )
   public static int field10432;
   @OriginalMember(
      owner = "client!jia",
      name = "j",
      descriptor = "I"
   )
   public static int field10434;
   @OriginalMember(
      owner = "client!jia",
      name = "m",
      descriptor = "I"
   )
   public static int field10435;
   @OriginalMember(
      owner = "client!jia",
      name = "f",
      descriptor = "I"
   )
   public static int field10436;
   @OriginalMember(
      owner = "client!jia",
      name = "o",
      descriptor = "I"
   )
   public static int field10437;
   @OriginalMember(
      owner = "client!jia",
      name = "c",
      descriptor = "I"
   )
   public int field10440;

   @OriginalMember(
      owner = "client!jia",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method5191(byte arg0) {
      try {
         class407 var2 = this.field10438;
         synchronized(this.field10438) {
            this.field10438.method3201((byte)-1);
            if (arg0 != -14) {
               this.method5197(48, 126);
            }
         }

         ++field10428;
         class407 var3 = this.field10439;
         synchronized(this.field10439) {
            this.field10439.method3201((byte)-12);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field10441[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5192(int arg0) {
      try {
         if (arg0 <= -62) {
            class407 var2 = this.field10430;
            synchronized(this.field10430) {
               this.field10430.method3187(-23825);
            }

            ++field10427;
            class407 var3 = this.field10438;
            synchronized(this.field10438) {
               this.field10438.method3187(-23825);
            }

            class407 var4 = this.field10439;
            synchronized(this.field10439) {
               this.field10439.method3187(-23825);
            }
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field10441[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method5193(byte arg0) {
      try {
         ++field10436;
         class407 var2 = this.field10430;
         synchronized(this.field10430) {
            this.field10430.method3201((byte)125);
         }

         class407 var3 = this.field10438;
         synchronized(this.field10438) {
            this.field10438.method3201((byte)99);
            if (arg0 < 37) {
               this.field10438 = null;
            }
         }

         class407 var4 = this.field10439;
         synchronized(this.field10439) {
            this.field10439.method3201((byte)115);
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field10441[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method5194(boolean arg0, int arg1) {
      try {
         ++field10437;
         if (arg0 == !this.field10431) {
            if (arg1 != -1) {
               this.field10438 = null;
            }

            this.field10431 = arg0;
            this.method5193((byte)38);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10441[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method5195(int arg0, int arg1) {
      try {
         this.field10440 = arg1;
         ++field10432;
         class407 var3 = this.field10438;
         synchronized(this.field10438) {
            this.field10438.method3201((byte)-90);
         }

         class407 var4 = this.field10439;
         synchronized(this.field10439) {
            this.field10439.method3201((byte)-77);
            if (arg0 != -1) {
               this.field10430 = null;
            }

         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10441[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "c",
      descriptor = "(II)V"
   )
   public final void method5196(int arg0, int arg1) {
      try {
         class407 var3 = this.field10430;
         synchronized(this.field10430) {
            this.field10430.method3197(5, arg0);
         }

         ++field10434;
         class407 var4 = this.field10438;
         synchronized(this.field10438) {
            this.field10438.method3197(5, arg0);
         }

         class407 var5 = this.field10439;
         synchronized(this.field10439) {
            this.field10439.method3197(5, arg0);
         }

         if (arg1 > -61) {
            this.field10440 = -82;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field10441[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(II)Lmt;"
   )
   public final class473 method5197(int arg0, int arg1) {
      try {
         ++field10435;
         class407 var3 = this.field10430;
         class473 var4;
         synchronized(this.field10430) {
            var4 = (class473)this.field10430.method3192((long)arg0, (byte)-111);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field10426;
            byte[] var6;
            synchronized(this.field10426) {
               var6 = this.field10426.method2697(class558.method4206((byte)-19, arg0), class373.method2951(109, arg0), false);
            }

            class473 var7 = new class473();
            var7.field6569 = this;
            var7.field6574 = arg0;
            if (var6 != null) {
               var7.method3590(new class66(var6), -96);
            }

            var7.method3597(false);
            if (arg1 > -118) {
               this.method5193((byte)-72);
            }

            class407 var8 = this.field10430;
            synchronized(this.field10430) {
               this.field10430.method3190(var7, (long)arg0, 8);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field10441[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5198(int arg0) {
      try {
         field10425 = null;
         if (arg0 != -1) {
            field10425 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10441[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "<init>",
      descriptor = "(Lkb;IZLww;Lww;)V"
   )
   public class711(class500 arg0, int arg1, boolean arg2, class339 arg3, class339 arg4) {
      try {
         this.field10426 = arg3;
         this.field10429 = arg0;
         this.field10431 = arg2;
         this.field10433 = arg4;
         if (this.field10426 != null) {
            int var6 = this.field10426.method2703((byte)126) - 1;
            this.field10426.method2691(var6, 122);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10441[8] + (arg0 != null ? field10441[7] : field10441[9]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10441[7] : field10441[9]) + ',' + (arg4 != null ? field10441[7] : field10441[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5199(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5200(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 79;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
