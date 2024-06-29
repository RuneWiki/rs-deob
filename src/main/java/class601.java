import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class601 {
   @OriginalMember(
      owner = "client!nf",
      name = "o",
      descriptor = "Lld;"
   )
   private class178 field8672 = new class178(256);
   @OriginalMember(
      owner = "client!nf",
      name = "k",
      descriptor = "Lld;"
   )
   private class178 field8681 = new class178(256);
   @OriginalMember(
      owner = "client!nf",
      name = "j",
      descriptor = "Lhw;"
   )
   private class141 field8680;
   @OriginalMember(
      owner = "client!nf",
      name = "n",
      descriptor = "Lhw;"
   )
   private class141 field8674;
   @OriginalMember(
      owner = "client!nf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8682 = new String[]{method4443(method4442("I=u\u0011\u000e")), method4443(method4442("\\f7S")), method4443(method4442("\\uu~[")), method4443(method4442("\\uu\u0003\u001a\\z/\u0001[")), method4443(method4442("\\uu|[")), method4443(method4442("\\uuz[")), method4443(method4442("\\uuy[")), method4443(method4442("\\uu{[")), method4443(method4442("\\uu}["))};
   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "I"
   )
   public static int field8669 = 1;
   @OriginalMember(
      owner = "client!nf",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field8671 = null;
   @OriginalMember(
      owner = "client!nf",
      name = "i",
      descriptor = "Lqg;"
   )
   public static class485 field8675 = new class485(6, 1);
   @OriginalMember(
      owner = "client!nf",
      name = "l",
      descriptor = "I"
   )
   public static int field8667;
   @OriginalMember(
      owner = "client!nf",
      name = "f",
      descriptor = "I"
   )
   public static int field8668;
   @OriginalMember(
      owner = "client!nf",
      name = "e",
      descriptor = "I"
   )
   public static int field8670;
   @OriginalMember(
      owner = "client!nf",
      name = "m",
      descriptor = "I"
   )
   public static int field8673;
   @OriginalMember(
      owner = "client!nf",
      name = "d",
      descriptor = "I"
   )
   public static int field8676;
   @OriginalMember(
      owner = "client!nf",
      name = "g",
      descriptor = "I"
   )
   public static int field8677;
   @OriginalMember(
      owner = "client!nf",
      name = "h",
      descriptor = "I"
   )
   public static int field8678;
   @OriginalMember(
      owner = "client!nf",
      name = "b",
      descriptor = "Ltd;"
   )
   public static class476 field8679;

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(II[I)Lri;"
   )
   public final class122 method4436(int arg0, int arg1, int[] arg2) {
      try {
         ++field8677;
         if (~this.field8680.method1337((byte)103) == -2) {
            return this.method4437(arg2, arg0, -80, 0);
         } else if (this.field8680.method1346(arg0, arg1 ^ arg1) == 1) {
            return this.method4437(arg2, 0, -117, arg0);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8682[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8682[0] : field8682[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "([IIII)Lri;"
   )
   private final class122 method4437(int[] arg0, int arg1, int arg2, int arg3) {
      try {
         ++field8676;
         int var5 = arg1 ^ (65529 & arg3 << 4 | arg3 >>> 12);
         int var6 = var5 | arg3 << 16;
         long var7 = (long)var6;
         class122 var9 = (class122)this.field8681.method1572(var7, -16289);
         if (var9 != null) {
            return var9;
         } else if (arg0 != null && arg0[0] <= 0) {
            return null;
         } else {
            if (arg2 >= -39) {
               method4438(37);
            }

            class239 var10 = class239.method1957(this.field8680, arg3, arg1);
            if (var10 == null) {
               return null;
            } else {
               class122 var11 = var10.method1958();
               this.field8681.method1566(var11, 24742, var7);
               if (arg0 != null) {
                  arg0[0] -= var11.field1957.length;
               }

               return var11;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field8682[5] + (arg0 != null ? field8682[0] : field8682[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method4438(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4439(byte arg0) {
      try {
         field8671 = null;
         field8675 = null;
         if (arg0 == -12) {
            field8679 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8682[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(I[IIB)Lri;"
   )
   private final class122 method4440(int arg0, int[] arg1, int arg2, byte arg3) {
      try {
         ++field8670;
         int var5 = arg2 ^ ((arg0 & -268431361) << 4 | arg0 >>> 12);
         int var6 = var5 | arg0 << 16;
         long var7 = 4294967296L ^ (long)var6;
         class122 var9 = (class122)this.field8681.method1572(var7, -16289);
         if (var9 != null) {
            return var9;
         } else if (arg1 != null && ~arg1[0] >= -1) {
            return null;
         } else {
            int var10 = -13 % ((-75 - arg3) / 50);
            class214 var11 = (class214)this.field8672.method1572(var7, -16289);
            if (var11 == null) {
               var11 = class214.method1819(this.field8674, arg0, arg2);
               if (var11 == null) {
                  return null;
               }

               this.field8672.method1566(var11, 24742, var7);
            }

            class122 var12 = var11.method1823(arg1);
            if (var12 == null) {
               return null;
            } else {
               var11.method154(-1);
               this.field8681.method1566(var12, 24742, var7);
               return var12;
            }
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field8682[2] + arg0 + ',' + (arg1 != null ? field8682[0] : field8682[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "([III)Lri;"
   )
   public final class122 method4441(int[] arg0, int arg1, int arg2) {
      try {
         ++field8668;
         if (~this.field8674.method1337((byte)121) == arg1) {
            return this.method4440(0, arg0, arg2, (byte)-126);
         } else if (~this.field8674.method1346(arg2, 0) == -2) {
            return this.method4440(arg2, arg0, 0, (byte)-125);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8682[4] + (arg0 != null ? field8682[0] : field8682[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "<init>",
      descriptor = "(Lhw;Lhw;)V"
   )
   public class601(class141 arg0, class141 arg1) {
      try {
         this.field8680 = arg0;
         this.field8674 = arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8682[3] + (arg0 != null ? field8682[0] : field8682[1]) + ',' + (arg1 != null ? field8682[0] : field8682[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4442(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4443(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
