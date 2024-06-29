import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class341 {
   @OriginalMember(
      owner = "client!kda",
      name = "e",
      descriptor = "Liw;"
   )
   private class107 field5020 = new class107(64);
   @OriginalMember(
      owner = "client!kda",
      name = "g",
      descriptor = "Lsa;"
   )
   private class39 field5026;
   @OriginalMember(
      owner = "client!kda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5030 = new String[]{method2722(method2721("\u0018-IrR[")), method2722(method2721("\u0018-Ir[[")), method2722(method2721("\bg\u0006rg")), method2722(method2721("\u0018-Ir_[")), method2722(method2721("\u001d<D0")), method2722(method2721("\u0018-Ir&\u001a'A($[")), method2722(method2721("\u0018-Ir^[")), method2722(method2721("\u0018-Ir\\[")), method2722(method2721("\u0018-IrX[")), method2722(method2721("\u0018-IrY[")), method2722(method2721("\u0018-Ir]["))};
   @OriginalMember(
      owner = "client!kda",
      name = "k",
      descriptor = "I"
   )
   public static int field5029 = -1;
   @OriginalMember(
      owner = "client!kda",
      name = "d",
      descriptor = "I"
   )
   public static int field5016;
   @OriginalMember(
      owner = "client!kda",
      name = "f",
      descriptor = "I"
   )
   public static int field5017;
   @OriginalMember(
      owner = "client!kda",
      name = "c",
      descriptor = "I"
   )
   public static int field5018;
   @OriginalMember(
      owner = "client!kda",
      name = "n",
      descriptor = "I"
   )
   public static int field5019;
   @OriginalMember(
      owner = "client!kda",
      name = "h",
      descriptor = "I"
   )
   public static int field5021;
   @OriginalMember(
      owner = "client!kda",
      name = "m",
      descriptor = "I"
   )
   public static int field5022;
   @OriginalMember(
      owner = "client!kda",
      name = "l",
      descriptor = "I"
   )
   public static int field5023;
   @OriginalMember(
      owner = "client!kda",
      name = "i",
      descriptor = "I"
   )
   public static int field5027;
   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "I"
   )
   public static int field5028;
   @OriginalMember(
      owner = "client!kda",
      name = "b",
      descriptor = "[[I"
   )
   public static int[][] field5024;
   @OriginalMember(
      owner = "client!kda",
      name = "j",
      descriptor = "[[Lkn;"
   )
   public static class437[][] field5025;

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(ILjga;II)V"
   )
   public static final void method2713(int arg0, class91 arg1, int arg2, int arg3) {
      try {
         class326.field4841 = arg0;
         if (arg3 == 0) {
            class368.field5435 = arg2;
            class178.field2627 = arg1;
            ++field5028;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5030[3] + arg0 + ',' + (arg1 != null ? field5030[2] : field5030[4]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method2714(int arg0, boolean arg1) {
      try {
         ++field5023;
         if (arg1) {
            field5029 = -29;
         }

         class107 var3 = this.field5020;
         synchronized(this.field5020) {
            this.field5020.method1048(arg0, -8543);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5030[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method2715(int arg0, int arg1) {
      try {
         ++field5027;
         class107 var3 = this.field5020;
         synchronized(this.field5020) {
            this.field5020.method1052(true);
            this.field5020 = new class107(arg0);
            int var4 = 54 % ((arg1 - 56) / 53);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field5030[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2716(int arg0) {
      try {
         ++field5022;
         class107 var2 = this.field5020;
         synchronized(this.field5020) {
            this.field5020.method1045(arg0 ^ -18121);
         }

         if (arg0 != -18124) {
            this.method2716(-23);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5030[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2717(byte arg0) {
      try {
         field5025 = null;
         if (arg0 < 109) {
            method2713(47, (class91)null, -39, -41);
         }

         field5024 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5030[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(II)Lhl;"
   )
   public final class507 method2718(int arg0, int arg1) {
      try {
         ++field5016;
         if (arg0 != -1) {
            this.field5026 = null;
         }

         class107 var3 = this.field5020;
         class507 var4;
         synchronized(this.field5020) {
            var4 = (class507)this.field5020.method1041((long)arg1, arg0 ^ -9);
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field5026;
            byte[] var6;
            synchronized(this.field5026) {
               var6 = this.field5026.method460((byte)-11, class801.method5772(arg1, (byte)102), class414.method3236(arg1, true));
            }

            class507 var7 = new class507();
            if (var6 != null) {
               var7.method3820(new class65(var6), arg0 + 121);
            }

            class107 var8 = this.field5020;
            synchronized(this.field5020) {
               this.field5020.method1050(arg0 ^ 80, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field5030[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "a",
      descriptor = "(IZI)Z"
   )
   public static final boolean method2719(int arg0, boolean arg1, int arg2) {
      try {
         ++field5021;
         if (!arg1) {
            method2713(-96, (class91)null, 109, 122);
         }

         return (52 & arg2) != 0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field5030[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method2720(byte arg0) {
      try {
         ++field5019;
         if (arg0 != -9) {
            field5018 = 106;
         }

         class107 var2 = this.field5020;
         synchronized(this.field5020) {
            this.field5020.method1052(true);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5030[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "<init>",
      descriptor = "(Ltb;ILsa;)V"
   )
   public class341(class392 arg0, int arg1, class39 arg2) {
      try {
         this.field5026 = arg2;
         if (this.field5026 != null) {
            int var4 = this.field5026.method454(100) + -1;
            this.field5026.method434((byte)-106, var4);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5030[5] + (arg0 != null ? field5030[2] : field5030[4]) + ',' + arg1 + ',' + (arg2 != null ? field5030[2] : field5030[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2721(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2722(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 115;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
