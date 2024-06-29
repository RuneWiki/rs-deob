import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class697 {
   @OriginalMember(
      owner = "client!jh",
      name = "j",
      descriptor = "Lpf;"
   )
   private class424 field10054 = new class424();
   @OriginalMember(
      owner = "client!jh",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   public String field10060;
   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10069 = new String[]{method5106(method5105("EWZ\u0014m")), method5106(method5105("AJ\u0018:")), method5106(method5105("T\u0011Zx8")), method5106(method5105("EWZ\u0012m")), method5106(method5105("EWZ\u001em")), method5106(method5105("EWZ\u0010m")), method5106(method5105("EWZ\u0011m")), method5106(method5105("EWZj,AV\u0000hm")), method5106(method5105("EWZ\u0013m")), method5106(method5105("EWZ\u0017m")), method5106(method5105("EWZ\u0015m"))};
   @OriginalMember(
      owner = "client!jh",
      name = "c",
      descriptor = "I"
   )
   public static int field10057 = 0;
   @OriginalMember(
      owner = "client!jh",
      name = "e",
      descriptor = "I"
   )
   public static int field10068 = 0;
   @OriginalMember(
      owner = "client!jh",
      name = "o",
      descriptor = "I"
   )
   public static int field10055;
   @OriginalMember(
      owner = "client!jh",
      name = "n",
      descriptor = "I"
   )
   public static int field10056;
   @OriginalMember(
      owner = "client!jh",
      name = "k",
      descriptor = "I"
   )
   public static int field10058;
   @OriginalMember(
      owner = "client!jh",
      name = "d",
      descriptor = "I"
   )
   public static int field10059;
   @OriginalMember(
      owner = "client!jh",
      name = "g",
      descriptor = "I"
   )
   public static int field10062;
   @OriginalMember(
      owner = "client!jh",
      name = "h",
      descriptor = "I"
   )
   public static int field10064;
   @OriginalMember(
      owner = "client!jh",
      name = "f",
      descriptor = "I"
   )
   private volatile int field10066;
   @OriginalMember(
      owner = "client!jh",
      name = "l",
      descriptor = "I"
   )
   public static int field10067;
   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "Lbh;"
   )
   public static class758 field10061;
   @OriginalMember(
      owner = "client!jh",
      name = "i",
      descriptor = "Lhr;"
   )
   private class98 field10063;
   @OriginalMember(
      owner = "client!jh",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field10065;

   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(Ldea;Z)V"
   )
   public final void method5097(class471 arg0, boolean arg1) {
      try {
         ++field10067;
         arg0.field6827 = true;
         class424 var3 = this.field10054;
         synchronized(this.field10054) {
            this.field10054.method3310(0, arg0);
            ++this.field10066;
            if (arg1) {
               field10068 = -36;
            }
         }

         if (this.field10063 != null) {
            class98 var4 = this.field10063;
            synchronized(this.field10063) {
               this.field10063.notify();
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field10069[10] + (arg0 != null ? field10069[2] : field10069[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(ILhr;)V"
   )
   public final void method5098(int arg0, class98 arg1) {
      try {
         this.field10063 = arg1;
         ++field10062;
         if (arg0 != 173) {
            field10061 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field10069[0] + arg0 + ',' + (arg1 != null ? field10069[2] : field10069[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(ILuq;)V"
   )
   public final void method5099(int arg0, class555 arg1) {
      try {
         class424 var3 = this.field10054;
         synchronized(this.field10054) {
            this.field10054.method3310(arg0, arg1);
            ++this.field10066;
         }

         ++field10056;
         if (this.field10063 != null) {
            class98 var4 = this.field10063;
            synchronized(this.field10063) {
               this.field10063.notify();
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field10069[4] + arg0 + ',' + (arg1 != null ? field10069[2] : field10069[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method5100(int arg0) {
      try {
         if (arg0 <= 25) {
            return false;
         } else {
            ++field10055;
            return ~this.field10066 == -1;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10069[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(II)I"
   )
   public static int method5101(int arg0, int arg1) {
      try {
         return arg0 & arg1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10069[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(ILdea;)V"
   )
   public final void method5102(int arg0, class471 arg1) {
      try {
         ++field10064;
         if (arg0 == 28856) {
            arg1.field6827 = false;
            class424 var3 = this.field10054;
            synchronized(this.field10054) {
               this.field10054.method3310(0, arg1);
               ++this.field10066;
            }

            if (this.field10063 != null) {
               class98 var4 = this.field10063;
               synchronized(this.field10063) {
                  this.field10063.notify();
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field10069[6] + arg0 + ',' + (arg1 != null ? field10069[2] : field10069[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(I)Lig;"
   )
   public final class686 method5103(int arg0) {
      try {
         ++field10059;
         Object var2 = null;
         class424 var3 = this.field10054;
         synchronized(this.field10054) {
            class686 var4 = this.field10054.method3307(arg0 + 16976);
            if (arg0 != 0) {
               return null;
            } else {
               var4.method4994((byte)-127);
               --this.field10066;
               return var4;
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field10069[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5104(int arg0) {
      try {
         if (arg0 == 0) {
            field10061 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10069[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V"
   )
   public class697(String arg0) {
      try {
         this.field10060 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field10069[7] + (arg0 != null ? field10069[2] : field10069[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5105(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5106(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
