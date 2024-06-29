import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class113 {
   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "Liw;"
   )
   private class107 field1788 = new class107(64);
   @OriginalMember(
      owner = "client!su",
      name = "g",
      descriptor = "Lsa;"
   )
   private class39 field1787;
   @OriginalMember(
      owner = "client!su",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1795 = new String[]{method1113(method1112("\u0014;\u0010\u000fd")), method1113(method1112("\u0014;\u0010\td")), method1113(method1112("\u0014;\u0010\nd")), method1113(method1112("\u0014;\u0010\u000ed")), method1113(method1112("\u0014;\u0010p%\t'Jrd")), method1113(method1112("\t;R ")), method1113(method1112("\u001c`\u0010b1")), method1113(method1112("\u0014;\u0010\rd")), method1113(method1112("\u0014;\u0010\bd"))};
   @OriginalMember(
      owner = "client!su",
      name = "d",
      descriptor = "Lvaa;"
   )
   public static class542 field1793 = new class542();
   @OriginalMember(
      owner = "client!su",
      name = "e",
      descriptor = "I"
   )
   public static int field1786;
   @OriginalMember(
      owner = "client!su",
      name = "b",
      descriptor = "I"
   )
   public static int field1789;
   @OriginalMember(
      owner = "client!su",
      name = "i",
      descriptor = "I"
   )
   public static int field1790;
   @OriginalMember(
      owner = "client!su",
      name = "f",
      descriptor = "I"
   )
   public static int field1791;
   @OriginalMember(
      owner = "client!su",
      name = "c",
      descriptor = "I"
   )
   public static int field1792;
   @OriginalMember(
      owner = "client!su",
      name = "h",
      descriptor = "Ldu;"
   )
   public static class92 field1794;

   @OriginalMember(
      owner = "client!su",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method1106(boolean arg0) {
      try {
         field1793 = null;
         field1794 = null;
         if (!arg0) {
            field1793 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field1795[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(II)Ltga;"
   )
   public final class175 method1107(int arg0, int arg1) {
      try {
         ++field1789;
         class107 var3 = this.field1788;
         class175 var4;
         synchronized(this.field1788) {
            var4 = (class175)this.field1788.method1041((long)arg1, 8);
         }

         if (var4 != null) {
            return var4;
         } else {
            if (arg0 != 0) {
               this.field1787 = null;
            }

            class39 var5 = this.field1787;
            byte[] var6;
            synchronized(this.field1787) {
               var6 = this.field1787.method460((byte)-11, arg1, 31);
            }

            class175 var7 = new class175();
            if (var6 != null) {
               var7.method1610(new class65(var6), -19);
            }

            class107 var8 = this.field1788;
            synchronized(this.field1788) {
               this.field1788.method1050(-74, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field1795[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1108(byte arg0) {
      try {
         if (arg0 > 9) {
            ++field1792;
            class107 var2 = this.field1788;
            synchronized(this.field1788) {
               this.field1788.method1052(true);
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1795[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method1109(byte arg0, int arg1) {
      try {
         ++field1786;
         if (arg0 != 74) {
            field1793 = null;
         }

         class107 var3 = this.field1788;
         synchronized(this.field1788) {
            this.field1788.method1048(arg1, -8543);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field1795[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(IBI)V"
   )
   public static final void method1110(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 != 11) {
            field1793 = null;
         }

         ++field1790;
         if (class343.field5054 == class122.field1967) {
            if (!class627.method4612(1, (byte)106, false, arg2, -2, 0, 0, 1, arg0)) {
               class627.method4612(1, (byte)106, false, arg2, -3, 0, 0, 1, arg0);
            }
         } else if (!class627.method4612(1, (byte)106, false, arg2, -3, 0, 0, 1, arg0)) {
            class627.method4612(1, (byte)106, false, arg2, -2, 0, 0, 1, arg0);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field1795[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method1111(boolean arg0) {
      try {
         ++field1791;
         class107 var2 = this.field1788;
         synchronized(this.field1788) {
            if (!arg0) {
               this.field1788.method1045(3);
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field1795[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "<init>",
      descriptor = "(Ltb;ILsa;)V"
   )
   public class113(class392 arg0, int arg1, class39 arg2) {
      try {
         this.field1787 = arg2;
         this.field1787.method434((byte)-106, 31);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field1795[4] + (arg0 != null ? field1795[6] : field1795[5]) + ',' + arg1 + ',' + (arg2 != null ? field1795[6] : field1795[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!su",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1112(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!su",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1113(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
