import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class532 {
   @OriginalMember(
      owner = "client!od",
      name = "g",
      descriptor = "Ldw;"
   )
   private class748 field7772 = new class748(64);
   @OriginalMember(
      owner = "client!od",
      name = "e",
      descriptor = "Ldw;"
   )
   public class748 field7779 = new class748(2);
   @OriginalMember(
      owner = "client!od",
      name = "l",
      descriptor = "Leaa;"
   )
   public class526 field7771;
   @OriginalMember(
      owner = "client!od",
      name = "m",
      descriptor = "Leaa;"
   )
   private class526 field7765;
   @OriginalMember(
      owner = "client!od",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7781 = new String[]{method3953(method3952("U\u007f3>b")), method3953(method3952("U\u007f3:b")), method3953(method3952("U\u007f3;b")), method3953(method3952("U\u007f3<b")), method3953(method3952("U\u007f39b")), method3953(method3952("Tnq\u0011")), method3953(method3952("A53S7")), method3953(method3952("U\u007f3A#TriCb")), method3953(method3952("U\u007f3?b")), method3953(method3952("U\u007f38b"))};
   @OriginalMember(
      owner = "client!od",
      name = "f",
      descriptor = "Lcj;"
   )
   public static class721 field7768 = new class721(15, 0, 1, 0);
   @OriginalMember(
      owner = "client!od",
      name = "k",
      descriptor = "Lnn;"
   )
   public static class436 field7775 = new class436(method3953(method3952("mOT")), method3953(method3952("U}{\u0014)_")), method3953(method3952("eli\u0014")), 5);
   @OriginalMember(
      owner = "client!od",
      name = "i",
      descriptor = "[Lega;"
   )
   public static class739[] field7778 = new class739[4];
   @OriginalMember(
      owner = "client!od",
      name = "d",
      descriptor = "I"
   )
   public static int field7766;
   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "I"
   )
   public static int field7767;
   @OriginalMember(
      owner = "client!od",
      name = "o",
      descriptor = "I"
   )
   public static int field7769;
   @OriginalMember(
      owner = "client!od",
      name = "j",
      descriptor = "I"
   )
   public static int field7770;
   @OriginalMember(
      owner = "client!od",
      name = "h",
      descriptor = "I"
   )
   public static int field7773;
   @OriginalMember(
      owner = "client!od",
      name = "n",
      descriptor = "I"
   )
   public static int field7774;
   @OriginalMember(
      owner = "client!od",
      name = "c",
      descriptor = "I"
   )
   public static int field7776;
   @OriginalMember(
      owner = "client!od",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field7780;
   @OriginalMember(
      owner = "client!od",
      name = "b",
      descriptor = "[Lvs;"
   )
   public static class616[] field7777;

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(I)V",
      line = 6
   )
   public static void method3945(int arg0) {
      try {
         int var1 = 38 / ((arg0 - 53) / 36);
         field7778 = null;
         field7775 = null;
         field7777 = null;
         field7768 = null;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7781[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(IBI)Z",
      line = 22
   )
   public static final boolean method3946(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 >= -28) {
            method3946(-114, (byte)26, 32);
         }

         ++field7767;
         if (!(~(65536 & arg2) != -1 | class415.method3173(arg2, 10695, arg0)) && !class9.method81(arg2, arg0, 1)) {
            return ~(arg0 & 55) == -1 && class625.method4509(arg2, arg0, true);
         } else {
            return true;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7781[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(III)Z",
      line = 39
   )
   public static final boolean method3947(int arg0, int arg1, int arg2) {
      try {
         if (arg2 != 50560) {
            return true;
         } else {
            ++field7774;
            return ~(50560 & arg1) != -1;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7781[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(II)Lke;",
      line = 50
   )
   public final class623 method3948(int arg0, int arg1) {
      try {
         ++field7769;
         class748 var3 = this.field7772;
         class623 var4;
         synchronized(this.field7772) {
            var4 = (class623)this.field7772.method5454((long)arg0, 18261);
         }

         if (var4 != null) {
            return var4;
         } else {
            class526 var5 = this.field7765;
            byte[] var6;
            synchronized(this.field7765) {
               var6 = this.field7765.method3899(-66, arg0, 33);
            }

            class623 var7 = new class623();
            var7.field9073 = this;
            if (var6 != null) {
               var7.method4498(new class128(var6), (byte)80);
            }

            class748 var8 = this.field7772;
            synchronized(this.field7772) {
               if (arg1 > -47) {
                  field7780 = false;
               }

               this.field7772.method5455(-2049, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field7781[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "b",
      descriptor = "(I)V",
      line = 82
   )
   public final void method3949(int arg0) {
      try {
         if (arg0 >= -48) {
            field7775 = null;
         }

         ++field7773;
         class748 var2 = this.field7772;
         synchronized(this.field7772) {
            this.field7772.method5445(697465426);
         }

         class748 var3 = this.field7779;
         synchronized(this.field7779) {
            this.field7779.method5445(697465426);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field7781[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "c",
      descriptor = "(I)V",
      line = 109
   )
   public final void method3950(int arg0) {
      try {
         class748 var2 = this.field7772;
         synchronized(this.field7772) {
            this.field7772.method5451(arg0 + 97);
            if (arg0 != 2) {
               this.field7771 = null;
            }
         }

         ++field7766;
         class748 var3 = this.field7779;
         synchronized(this.field7779) {
            this.field7779.method5451(-126);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field7781[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(IB)V",
      line = 125
   )
   public final void method3951(int arg0, byte arg1) {
      try {
         class748 var3 = this.field7772;
         synchronized(this.field7772) {
            if (arg1 > -41) {
               return;
            }

            this.field7772.method5453(arg0, false);
         }

         ++field7770;
         class748 var4 = this.field7779;
         synchronized(this.field7779) {
            this.field7779.method5453(arg0, false);
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field7781[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;Leaa;)V",
      line = 158
   )
   public class532(class24 arg0, int arg1, class526 arg2, class526 arg3) {
      try {
         this.field7771 = arg3;
         this.field7765 = arg2;
         this.field7765.method3875(0, 33);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7781[7] + (arg0 != null ? field7781[6] : field7781[5]) + ',' + arg1 + ',' + (arg2 != null ? field7781[6] : field7781[5]) + ',' + (arg3 != null ? field7781[6] : field7781[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3952(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!od",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3953(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
