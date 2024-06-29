import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class508 {
   @OriginalMember(
      owner = "client!iea",
      name = "f",
      descriptor = "Ltv;"
   )
   private class590 field7041 = new class590(64);
   @OriginalMember(
      owner = "client!iea",
      name = "d",
      descriptor = "Lqh;"
   )
   private class74 field7046;
   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "Lcr;"
   )
   public class603 field7047;
   @OriginalMember(
      owner = "client!iea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7048 = new String[]{method3696(method3695("*G<J\u001bk")), method3696(method3695("*G<J\u001ak")), method3696(method3695("*G<J\u001dk")), method3696(method3695("*G<J\u0018k")), method3696(method3695("-W1\b")), method3696(method3695("*G<Je*L4\u0010gk")), method3696(method3695("8\fsJ$"))};
   @OriginalMember(
      owner = "client!iea",
      name = "i",
      descriptor = "I"
   )
   public static int field7039 = 0;
   @OriginalMember(
      owner = "client!iea",
      name = "e",
      descriptor = "I"
   )
   public static int field7038;
   @OriginalMember(
      owner = "client!iea",
      name = "b",
      descriptor = "I"
   )
   public static int field7040;
   @OriginalMember(
      owner = "client!iea",
      name = "j",
      descriptor = "I"
   )
   public static int field7042;
   @OriginalMember(
      owner = "client!iea",
      name = "g",
      descriptor = "I"
   )
   public static int field7043;
   @OriginalMember(
      owner = "client!iea",
      name = "h",
      descriptor = "I"
   )
   public static int field7044;
   @OriginalMember(
      owner = "client!iea",
      name = "c",
      descriptor = "I"
   )
   public static int field7045;

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(BI)Lrv;"
   )
   public final class120 method3691(byte arg0, int arg1) {
      try {
         ++field7040;
         class590 var3 = this.field7041;
         class120 var4;
         synchronized(this.field7041) {
            var4 = (class120)this.field7041.method4239((long)arg1, 0);
         }

         if (var4 != null) {
            return var4;
         } else {
            if (arg0 != -24) {
               this.field7041 = null;
            }

            class74 var5 = this.field7046;
            byte[] var6;
            synchronized(this.field7046) {
               var6 = this.field7046.method732(arg1, 32, (byte)46);
            }

            class120 var7 = new class120();
            var7.field1501 = this;
            if (var6 != null) {
               var7.method1018(new class594(var6), -30137);
            }

            class590 var8 = this.field7041;
            synchronized(this.field7041) {
               this.field7041.method4238(80, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field7048[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3692(int arg0, int arg1) {
      try {
         class590 var3 = this.field7041;
         synchronized(this.field7041) {
            this.field7041.method4234(2, arg0);
         }

         ++field7038;
         if (arg1 > -97) {
            this.field7047 = null;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7048[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3693(byte arg0) {
      try {
         ++field7043;
         class590 var2 = this.field7041;
         synchronized(this.field7041) {
            if (arg0 == -75) {
               this.field7041.method4244(true);
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field7048[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method3694(boolean arg0) {
      try {
         class590 var2 = this.field7041;
         synchronized(this.field7041) {
            this.field7041.method4245(true);
         }

         ++field7044;
         if (arg0) {
            this.method3692(79, -103);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field7048[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "<init>",
      descriptor = "(Lnc;ILqh;Lcr;)V"
   )
   public class508(class26 arg0, int arg1, class74 arg2, class603 arg3) {
      try {
         this.field7046 = arg2;
         this.field7046.method727(32, -32767);
         this.field7047 = arg3;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field7048[5] + (arg0 != null ? field7048[6] : field7048[4]) + ',' + arg1 + ',' + (arg2 != null ? field7048[6] : field7048[4]) + ',' + (arg3 != null ? field7048[6] : field7048[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3695(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3696(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 93;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
