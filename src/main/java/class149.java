import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class149 {
   @OriginalMember(
      owner = "client!wl",
      name = "f",
      descriptor = "Lhv;"
   )
   private class227 field1854 = new class227(256);
   @OriginalMember(
      owner = "client!wl",
      name = "h",
      descriptor = "Lhv;"
   )
   private class227 field1859 = new class227(256);
   @OriginalMember(
      owner = "client!wl",
      name = "c",
      descriptor = "Lww;"
   )
   private class339 field1851;
   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "Lww;"
   )
   private class339 field1855;
   @OriginalMember(
      owner = "client!wl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1863 = new String[]{method1203(method1202("\u0007$~bn")), method1203(method1202("\u001e=<L")), method1203(method1202("\u000bf~\u000e;")), method1203(method1202("\u0007$~\u001c/\u001e!$\u001en")), method1203(method1202("\u0007$~cn")), method1203(method1202("\u0007$~an")), method1203(method1202("\u0007$~fn")), method1203(method1202("\u0007$~en")), method1203(method1202("\u0007$~dn"))};
   @OriginalMember(
      owner = "client!wl",
      name = "j",
      descriptor = "I"
   )
   public static int field1852 = -2;
   @OriginalMember(
      owner = "client!wl",
      name = "l",
      descriptor = "I"
   )
   public static int field1853;
   @OriginalMember(
      owner = "client!wl",
      name = "e",
      descriptor = "I"
   )
   public static int field1856;
   @OriginalMember(
      owner = "client!wl",
      name = "k",
      descriptor = "I"
   )
   public static int field1857;
   @OriginalMember(
      owner = "client!wl",
      name = "i",
      descriptor = "I"
   )
   public static int field1858;
   @OriginalMember(
      owner = "client!wl",
      name = "g",
      descriptor = "I"
   )
   public static int field1860;
   @OriginalMember(
      owner = "client!wl",
      name = "b",
      descriptor = "I"
   )
   public static int field1861;
   @OriginalMember(
      owner = "client!wl",
      name = "d",
      descriptor = "I"
   )
   public static int field1862;

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(I[II)Lgb;"
   )
   public final class521 method1196(int arg0, int[] arg1, int arg2) {
      try {
         ++field1853;
         if (this.field1855.method2703((byte)126) == 1) {
            return this.method1197(-16, 0, arg2, arg1);
         } else if (arg0 != 0) {
            return null;
         } else if (~this.field1855.method2691(arg2, -18) == -2) {
            return this.method1197(103, arg2, 0, arg1);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1863[0] + arg0 + ',' + (arg1 != null ? field1863[2] : field1863[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(III[I)Lgb;"
   )
   private final class521 method1197(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         ++field1857;
         int var5 = (arg1 >>> 12 | (arg1 & 4095) << 4) ^ arg2;
         int var6 = var5 | arg1 << 16;
         long var7 = 4294967296L ^ (long)var6;
         class521 var9 = (class521)this.field1859.method1818(-1, var7);
         if (var9 != null) {
            return var9;
         } else if (arg3 != null && arg3[0] <= 0) {
            return null;
         } else {
            class672 var10 = (class672)this.field1854.method1818(-1, var7);
            if (var10 == null) {
               var10 = class672.method4918(this.field1855, arg1, arg2);
               if (var10 == null) {
                  return null;
               }

               this.field1854.method1808(var7, var10, 26459);
            }

            class521 var11 = var10.method4913(arg3);
            if (var11 == null) {
               return null;
            } else {
               int var12 = -103 % ((arg0 - 51) / 43);
               var10.method4924(-2970);
               this.field1859.method1808(var7, var11, 26459);
               return var11;
            }
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field1863[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1863[2] : field1863[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(Lha;B)V"
   )
   public static final void method1198(class479 param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(I[III)Lgb;"
   )
   private final class521 method1199(int arg0, int[] arg1, int arg2, int arg3) {
      try {
         ++field1856;
         int var5 = arg0 ^ (arg3 << 4 & 65535 | arg3 >>> 12);
         int var6 = var5 | arg3 << 16;
         long var7 = (long)var6;
         class521 var9 = (class521)this.field1859.method1818(-1, var7);
         if (var9 != null) {
            return var9;
         } else if (arg1 != null && ~arg1[0] >= -1) {
            return null;
         } else {
            class525 var10 = class525.method3928(this.field1851, arg3, arg0);
            if (var10 == null) {
               return null;
            } else {
               class521 var11 = var10.method3930();
               this.field1859.method1808(var7, var11, 26459);
               if (arg1 != null) {
                  arg1[0] -= var11.field7317.length;
               }

               return arg2 != -2 ? null : var11;
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field1863[8] + arg0 + ',' + (arg1 != null ? field1863[2] : field1863[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "b",
      descriptor = "(I[II)Lgb;"
   )
   public final class521 method1200(int arg0, int[] arg1, int arg2) {
      try {
         ++field1862;
         if (this.field1851.method2703((byte)126) == 1) {
            return this.method1199(arg2, arg1, -2, 0);
         } else if (arg0 != -8046) {
            return null;
         } else if (~this.field1851.method2691(arg2, 125) == -2) {
            return this.method1199(0, arg1, arg0 ^ 8044, arg2);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1863[7] + arg0 + ',' + (arg1 != null ? field1863[2] : field1863[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(BLkw;I)V"
   )
   public static final void method1201(byte arg0, class9 arg1, int arg2) {
      try {
         ++field1861;
         if (arg1.field123 != null) {
            int var3 = arg1.field123[arg2 + 1];
            if (arg1.field193 != var3) {
               arg1.field193 = var3;
               arg1.field211 = arg1.field208;
               arg1.field132 = 1;
               arg1.field163 = 0;
               arg1.field128 = 0;
               arg1.field166 = 0;
               if (~arg1.field193 != 0) {
                  class774.method5586(arg1, class532.field7812.method2473((byte)86, arg1.field193), 1673748489, arg1.field128);
               }
            }
         }

         if (arg0 != 1) {
            field1852 = -23;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1863[5] + arg0 + ',' + (arg1 != null ? field1863[2] : field1863[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "<init>",
      descriptor = "(Lww;Lww;)V"
   )
   public class149(class339 arg0, class339 arg1) {
      try {
         this.field1851 = arg0;
         this.field1855 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1863[3] + (arg0 != null ? field1863[2] : field1863[1]) + ',' + (arg1 != null ? field1863[2] : field1863[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1202(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1203(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
