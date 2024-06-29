import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class749 extends class454 {
   @OriginalMember(
      owner = "client!nfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10945 = new String[]{method5424(method5423("S\u001c3\u0010\u0007\u0015")), method5424(method5423("S\u001c3\u0010\u0004\u0015")), method5424(method5423("S\u001c3\u0010\u0000\u0015")), method5424(method5423("S\u001c3\u0010\u0005\u0015")), method5424(method5423("S\u001c3\u0010\u0003\u0015")), method5424(method5423("S\u001c3\u0010\u0001\u0015")), method5424(method5423("S\u001c3\u0010\u000e\u0015"))};
   @OriginalMember(
      owner = "client!nfa",
      name = "t",
      descriptor = "[J"
   )
   public static long[] field10939 = new long[10];
   @OriginalMember(
      owner = "client!nfa",
      name = "m",
      descriptor = "Lvv;"
   )
   public static class467 field10941 = new class467();
   @OriginalMember(
      owner = "client!nfa",
      name = "u",
      descriptor = "Lse;"
   )
   public static class6 field10944 = new class6(61, 6);
   @OriginalMember(
      owner = "client!nfa",
      name = "k",
      descriptor = "I"
   )
   public static int field10932;
   @OriginalMember(
      owner = "client!nfa",
      name = "r",
      descriptor = "I"
   )
   public static int field10933;
   @OriginalMember(
      owner = "client!nfa",
      name = "q",
      descriptor = "I"
   )
   public static int field10935;
   @OriginalMember(
      owner = "client!nfa",
      name = "j",
      descriptor = "I"
   )
   public static int field10936;
   @OriginalMember(
      owner = "client!nfa",
      name = "p",
      descriptor = "I"
   )
   public static int field10937;
   @OriginalMember(
      owner = "client!nfa",
      name = "i",
      descriptor = "I"
   )
   public static int field10940;
   @OriginalMember(
      owner = "client!nfa",
      name = "o",
      descriptor = "I"
   )
   public static int field10943;
   @OriginalMember(
      owner = "client!nfa",
      name = "n",
      descriptor = "Lpd;"
   )
   public static class648 field10942;
   @OriginalMember(
      owner = "client!nfa",
      name = "s",
      descriptor = "[J"
   )
   public static long[] field10934;
   @OriginalMember(
      owner = "client!nfa",
      name = "l",
      descriptor = "[Z"
   )
   public static boolean[] field10938;

   @OriginalMember(
      owner = "client!nfa",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class749(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method5420(int arg0) {
      try {
         if (arg0 != -18033) {
            return 4;
         } else {
            ++field10940;
            return super.field6263;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10945[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method5421(boolean arg0) {
      try {
         if (arg0) {
            field10935 = -62;
         }

         ++field10936;
         if (super.field6259.method5439(28852) == class450.field6103) {
            return !super.field6259.method5434((byte)-127);
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10945[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         super.field6263 = arg1;
         if (arg0 >= -46) {
            field10941 = null;
         }

         ++field10943;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10945[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class749(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         ++field10933;
         if (arg0 != 1) {
            this.method28(false);
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10945[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         if (arg1) {
            this.method5420(122);
         }

         ++field10932;
         if (super.field6259.method5439(28852) == class450.field6103) {
            if (super.field6259.method5434((byte)-111)) {
               return 3;
            } else {
               return ~arg0 != -1 && super.field6259.field10967.method1752(-18033) != 1 ? 2 : 1;
            }
         } else {
            return 3;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10945[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5422(int arg0) {
      try {
         field10934 = null;
         if (arg0 == 3072) {
            field10939 = null;
            field10941 = null;
            field10938 = null;
            field10942 = null;
            field10944 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10945[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         label31: {
            ++field10937;
            if (super.field6259.method5439(28852) == class450.field6103) {
               if (!super.field6259.method5434((byte)-126)) {
                  break label31;
               }

               super.field6263 = 0;
               if (!client.field1481) {
                  break label31;
               }
            }

            super.field6263 = 1;
         }

         if (!arg0) {
            field10942 = null;
         }

         if (super.field6263 != 0 && super.field6263 != 1) {
            super.field6263 = this.method23(1);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10945[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5423(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5424(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
