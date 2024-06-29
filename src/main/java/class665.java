import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class665 {
   @OriginalMember(
      owner = "client!jt",
      name = "f",
      descriptor = "Lsia;"
   )
   private class407 field9861 = new class407(64);
   @OriginalMember(
      owner = "client!jt",
      name = "c",
      descriptor = "Lww;"
   )
   private class339 field9860;
   @OriginalMember(
      owner = "client!jt",
      name = "i",
      descriptor = "I"
   )
   public int field9854;
   @OriginalMember(
      owner = "client!jt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9863 = new String[]{method4865(method4864("q/h??")), method4865(method4864("q/h;?")), method4865(method4864("`uhSj")), method4865(method4864("u.*\u0011")), method4865(method4864("q/h>?")), method4865(method4864("q/hA~u22C?")), method4865(method4864("q/h9?")), method4865(method4864("q/h8?"))};
   @OriginalMember(
      owner = "client!jt",
      name = "h",
      descriptor = "Llja;"
   )
   public static class728 field9856 = new class728();
   @OriginalMember(
      owner = "client!jt",
      name = "b",
      descriptor = "Lqb;"
   )
   public static class68 field9857 = new class68();
   @OriginalMember(
      owner = "client!jt",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field9862 = new int[13];
   @OriginalMember(
      owner = "client!jt",
      name = "g",
      descriptor = "I"
   )
   public static int field9853;
   @OriginalMember(
      owner = "client!jt",
      name = "d",
      descriptor = "I"
   )
   public static int field9855;
   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "I"
   )
   public static int field9858;
   @OriginalMember(
      owner = "client!jt",
      name = "e",
      descriptor = "I"
   )
   public static int field9859;

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(BLsa;)V"
   )
   public static final void method4858(byte arg0, class783 arg1) {
      try {
         ++field9853;
         if (arg0 < 44) {
            method4862(-75, -114, -45);
         }

         class258 var2 = (class258)class328.field4539.method1818(-1, (long)arg1.field145);
         if (var2 == null) {
            class647.method4754(256, arg1, arg1.field205[0], arg1.field10457, arg1.field210[0], (class294)null, 0, (class81)null);
         } else {
            var2.method2083(-120);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9863[4] + arg0 + ',' + (arg1 != null ? field9863[2] : field9863[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method4859(int arg0, byte arg1) {
      try {
         ++field9855;
         class191 var2 = (class191)class705.field10295.method1818(-1, (long)arg0);
         if (arg1 != -70) {
            method4861(true);
         }

         if (var2 != null) {
            var2.field2423.method2778((byte)127);
            class657.method4823(var2.field2427, (byte)-75, var2.field2429);
            var2.method4924(arg1 + -2900);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9863[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4860(int arg0) {
      try {
         field9857 = null;
         field9856 = null;
         if (arg0 != -31945) {
            method4861(true);
         }

         field9862 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9863[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4861(boolean arg0) {
      if (arg0) {
         class548.field8080 = class392.field5432;
         class659.field9815 = class569.field8364;
      } else {
         class548.field8080 = class520.field7312;
         class659.field9815 = class373.field5223;
      }

      class174.field2251 = class548.field8080.length;
   }

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4862(int arg0, int arg1, int arg2) {
      try {
         ++field9858;
         if (arg1 != 458752) {
            return false;
         } else {
            return ~(458752 & arg0) != -1 | class527.method3935(arg0, arg2, -1) || class693.method5052(false, arg2, arg0);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9863[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(BI)Lsaa;"
   )
   public final class659 method4863(byte arg0, int arg1) {
      try {
         ++field9859;
         class407 var3 = this.field9861;
         class659 var4;
         synchronized(this.field9861) {
            var4 = (class659)this.field9861.method3192((long)arg1, (byte)-105);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field9860;
            byte[] var6;
            synchronized(this.field9860) {
               var6 = this.field9860.method2697(arg1, 19, false);
            }

            class659 var7 = new class659();
            if (var6 != null) {
               var7.method4833(new class66(var6), arg0 + -23696);
            }

            class407 var8 = this.field9861;
            synchronized(this.field9861) {
               if (arg0 != -100) {
                  return null;
               } else {
                  this.field9861.method3190(var7, (long)arg1, arg0 ^ -108);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field9863[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "<init>",
      descriptor = "(Lkb;ILww;)V"
   )
   public class665(class500 arg0, int arg1, class339 arg2) {
      try {
         this.field9860 = arg2;
         this.field9854 = this.field9860.method2691(19, 13);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field9863[5] + (arg0 != null ? field9863[2] : field9863[3]) + ',' + arg1 + ',' + (arg2 != null ? field9863[2] : field9863[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4864(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4865(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
