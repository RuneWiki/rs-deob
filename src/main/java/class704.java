import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class704 {
   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "Llj;"
   )
   private class304 field10599 = new class304(64);
   @OriginalMember(
      owner = "client!bj",
      name = "f",
      descriptor = "Llj;"
   )
   public class304 field10606 = new class304(2);
   @OriginalMember(
      owner = "client!bj",
      name = "d",
      descriptor = "Lrr;"
   )
   public class678 field10598;
   @OriginalMember(
      owner = "client!bj",
      name = "c",
      descriptor = "Lrr;"
   )
   private class678 field10600;
   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10607 = new String[]{method5198(method5197("tLB-'")), method5198(method5197("tLB+'")), method5198(method5197("tLB,'")), method5198(method5197("tLBRfxO\u0018P'")), method5198(method5197("xS\u0000\u0002")), method5198(method5197("m\bB@r")), method5198(method5197("tLB/'")), method5198(method5197("tLB*'"))};
   @OriginalMember(
      owner = "client!bj",
      name = "e",
      descriptor = "I"
   )
   public static int field10597;
   @OriginalMember(
      owner = "client!bj",
      name = "g",
      descriptor = "I"
   )
   public static int field10601;
   @OriginalMember(
      owner = "client!bj",
      name = "j",
      descriptor = "I"
   )
   public static int field10602;
   @OriginalMember(
      owner = "client!bj",
      name = "h",
      descriptor = "I"
   )
   public static int field10603;
   @OriginalMember(
      owner = "client!bj",
      name = "i",
      descriptor = "I"
   )
   public static int field10604;
   @OriginalMember(
      owner = "client!bj",
      name = "b",
      descriptor = "I"
   )
   public static int field10605;

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(Z)V",
      line = 3
   )
   public final void method5192(boolean arg0) {
      try {
         class304 var2 = this.field10599;
         synchronized(this.field10599) {
            if (!arg0) {
               this.method5196(45);
            }

            this.field10599.method2554(-96);
         }

         ++field10605;
         class304 var3 = this.field10606;
         synchronized(this.field10606) {
            this.field10606.method2554(-101);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10607[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(JJ)J",
      line = 21
   )
   public static long method5193(long arg0, long arg1) {
      try {
         return arg0 & arg1;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field10607[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(II)V",
      line = 31
   )
   public final void method5194(int arg0, int arg1) {
      try {
         ++field10602;
         class304 var3 = this.field10599;
         synchronized(this.field10599) {
            this.field10599.method2552(arg1, 21533);
         }

         class304 var4 = this.field10606;
         synchronized(this.field10606) {
            this.field10606.method2552(arg1, 21533);
            int var5 = -128 / ((arg0 - 65) / 32);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field10607[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "b",
      descriptor = "(II)Lca;",
      line = 46
   )
   public final class748 method5195(int arg0, int arg1) {
      try {
         ++field10601;
         class304 var3 = this.field10599;
         class748 var4;
         synchronized(this.field10599) {
            var4 = (class748)this.field10599.method2544(false, (long)arg0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field10600;
            byte[] var6;
            synchronized(this.field10600) {
               var6 = this.field10600.method5017(33, arg0, (byte)71);
            }

            class748 var7 = new class748();
            var7.field11094 = this;
            if (var6 != null) {
               var7.method5493(new class354(var6), false);
            }

            class304 var8 = this.field10599;
            synchronized(this.field10599) {
               this.field10599.method2545((long)arg0, 106, var7);
            }

            if (arg1 != 10586) {
               this.method5195(-92, -98);
            }

            return var7;
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field10607[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(I)V",
      line = 77
   )
   public final void method5196(int arg0) {
      try {
         ++field10604;
         class304 var2 = this.field10599;
         synchronized(this.field10599) {
            this.field10599.method2551(true);
         }

         if (arg0 != 33) {
            this.method5192(false);
         }

         class304 var3 = this.field10606;
         synchronized(this.field10606) {
            this.field10606.method2551(true);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10607[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "<init>",
      descriptor = "(Ltv;ILrr;Lrr;)V",
      line = 105
   )
   public class704(class311 arg0, int arg1, class678 arg2, class678 arg3) {
      try {
         this.field10598 = arg3;
         this.field10600 = arg2;
         this.field10600.method4998((byte)-82, 33);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10607[3] + (arg0 != null ? field10607[5] : field10607[4]) + ',' + arg1 + ',' + (arg2 != null ? field10607[5] : field10607[4]) + ',' + (arg3 != null ? field10607[5] : field10607[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5197(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5198(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
