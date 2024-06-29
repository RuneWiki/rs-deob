import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class124 {
   @OriginalMember(
      owner = "client!io",
      name = "g",
      descriptor = "Liw;"
   )
   private class107 field1982 = new class107(64);
   @OriginalMember(
      owner = "client!io",
      name = "f",
      descriptor = "Lsa;"
   )
   private class39 field1987;
   @OriginalMember(
      owner = "client!io",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1990 = new String[]{method1226(method1225(">\u0013\t6\r")), method1226(method1225("9\tK\u0018")), method1226(method1225(">\u0013\t7\r")), method1226(method1225(",R\tZX")), method1226(method1225(">\u0013\tHL9\u0015SJ\r")), method1226(method1225(">\u0013\t1\r")), method1226(method1225(">\u0013\t2\r")), method1226(method1225(">\u0013\t0\r")), method1226(method1225(">\u0013\t5\r"))};
   @OriginalMember(
      owner = "client!io",
      name = "i",
      descriptor = "I"
   )
   public static int field1984 = 0;
   @OriginalMember(
      owner = "client!io",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field1983 = new int[2048];
   @OriginalMember(
      owner = "client!io",
      name = "e",
      descriptor = "I"
   )
   public static int field1981;
   @OriginalMember(
      owner = "client!io",
      name = "a",
      descriptor = "I"
   )
   public static int field1985;
   @OriginalMember(
      owner = "client!io",
      name = "c",
      descriptor = "I"
   )
   public static int field1986;
   @OriginalMember(
      owner = "client!io",
      name = "h",
      descriptor = "I"
   )
   public static int field1988;
   @OriginalMember(
      owner = "client!io",
      name = "d",
      descriptor = "I"
   )
   public static int field1989;

   @OriginalMember(
      owner = "client!io",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1219(int arg0) {
      try {
         class107 var2 = this.field1982;
         synchronized(this.field1982) {
            this.field1982.method1045(3);
         }

         if (arg0 >= -32) {
            field1983 = null;
         }

         ++field1986;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1990[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "a",
      descriptor = "(BLsa;)V"
   )
   public static final void method1220(byte arg0, class39 arg1) {
      try {
         if (arg0 > -72) {
            method1223(-117);
         }

         class596.field8394 = arg1;
         ++field1985;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field1990[2] + arg0 + ',' + (arg1 != null ? field1990[3] : field1990[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method1221(int arg0, int arg1) {
      try {
         class107 var3 = this.field1982;
         synchronized(this.field1982) {
            if (arg0 != 22934) {
               field1983 = null;
            }

            this.field1982.method1048(arg1, -8543);
         }

         ++field1989;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1990[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1222(int arg0) {
      try {
         ++field1981;
         if (arg0 != 11) {
            this.field1982 = null;
         }

         class107 var2 = this.field1982;
         synchronized(this.field1982) {
            this.field1982.method1052(true);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1990[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1223(int arg0) {
      try {
         if (arg0 == 0) {
            field1983 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1990[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "a",
      descriptor = "(II)Lor;"
   )
   public final class57 method1224(int arg0, int arg1) {
      try {
         ++field1988;
         class107 var3 = this.field1982;
         class57 var4;
         synchronized(this.field1982) {
            var4 = (class57)this.field1982.method1041((long)arg0, 8);
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field1987;
            byte[] var6;
            synchronized(this.field1987) {
               var6 = this.field1987.method460((byte)-11, arg0, arg1);
            }

            class57 var7 = new class57();
            if (var6 != null) {
               var7.method591(new class65(var6), -120);
            }

            class107 var8 = this.field1982;
            synchronized(this.field1982) {
               this.field1982.method1050(-83, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field1990[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "<init>",
      descriptor = "(Ltb;ILsa;)V"
   )
   public class124(class392 arg0, int arg1, class39 arg2) {
      try {
         this.field1987 = arg2;
         if (this.field1987 != null) {
            this.field1987.method434((byte)-106, 11);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1990[4] + (arg0 != null ? field1990[3] : field1990[1]) + ',' + arg1 + ',' + (arg2 != null ? field1990[3] : field1990[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1225(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!io",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1226(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 87;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
