import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class202 {
   @OriginalMember(
      owner = "client!rfa",
      name = "d",
      descriptor = "Liw;"
   )
   private class107 field2894 = new class107(128);
   @OriginalMember(
      owner = "client!rfa",
      name = "c",
      descriptor = "Liw;"
   )
   public class107 field2895 = new class107(64);
   @OriginalMember(
      owner = "client!rfa",
      name = "b",
      descriptor = "Lsa;"
   )
   public class39 field2891;
   @OriginalMember(
      owner = "client!rfa",
      name = "h",
      descriptor = "Lsa;"
   )
   private class39 field2893;
   @OriginalMember(
      owner = "client!rfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2896 = new String[]{method1759(method1758("B/\u0010b\u000b\u0018")), method1759(method1758("B/\u0010b\r\u0018")), method1759(method1758("B/\u0010bsY'\u00188q\u0018")), method1759(method1758("Kg_b2")), method1759(method1758("^<\u001d ")), method1759(method1758("B/\u0010b\n\u0018")), method1759(method1758("B/\u0010b\f\u0018")), method1759(method1758("B/\u0010b\t\u0018")), method1759(method1758("B/\u0010b\u000e\u0018"))};
   @OriginalMember(
      owner = "client!rfa",
      name = "k",
      descriptor = "Z"
   )
   public static boolean field2887 = false;
   @OriginalMember(
      owner = "client!rfa",
      name = "g",
      descriptor = "I"
   )
   public static int field2885;
   @OriginalMember(
      owner = "client!rfa",
      name = "f",
      descriptor = "I"
   )
   public static int field2886;
   @OriginalMember(
      owner = "client!rfa",
      name = "e",
      descriptor = "I"
   )
   public static int field2888;
   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "I"
   )
   public static int field2889;
   @OriginalMember(
      owner = "client!rfa",
      name = "i",
      descriptor = "I"
   )
   public static int field2890;
   @OriginalMember(
      owner = "client!rfa",
      name = "j",
      descriptor = "I"
   )
   public static int field2892;

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method1752(int arg0, int arg1) {
      try {
         class107 var3 = this.field2894;
         synchronized(this.field2894) {
            this.field2894.method1048(arg0, -8543);
         }

         ++field2890;
         class107 var4 = this.field2895;
         synchronized(this.field2895) {
            if (arg1 != 5926) {
               this.method1757(66);
            }

            this.field2895.method1048(arg0, arg1 ^ -13945);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field2896[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method1753(int arg0) {
      try {
         if (arg0 != -7404) {
            field2887 = false;
         }

         class107 var2 = this.field2894;
         synchronized(this.field2894) {
            this.field2894.method1052(true);
         }

         ++field2892;
         class107 var3 = this.field2895;
         synchronized(this.field2895) {
            this.field2895.method1052(true);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2896[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(ZII)V"
   )
   public final void method1754(boolean arg0, int arg1, int arg2) {
      try {
         if (!arg0) {
            this.method1756(-90, 6);
         }

         this.field2894 = new class107(arg2);
         ++field2885;
         this.field2895 = new class107(arg1);
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2896[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(II[Ljava/lang/String;I[S)V"
   )
   public static final void method1755(int param0, int param1, String[] param2, int param3, short[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "b",
      descriptor = "(II)Ljca;"
   )
   public final class541 method1756(int arg0, int arg1) {
      try {
         ++field2888;
         class107 var3 = this.field2894;
         class541 var4;
         synchronized(this.field2894) {
            var4 = (class541)this.field2894.method1041((long)arg1, 8);
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field2893;
            byte[] var6;
            synchronized(this.field2893) {
               var6 = this.field2893.method460((byte)-11, arg1, arg0);
            }

            class541 var7 = new class541();
            var7.field7632 = this;
            var7.field7623 = arg1;
            if (var6 != null) {
               var7.method4031(10, new class65(var6));
            }

            var7.method4033((byte)45);
            class107 var8 = this.field2894;
            synchronized(this.field2894) {
               this.field2894.method1050(-116, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field2896[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method1757(int arg0) {
      try {
         class107 var2 = this.field2894;
         synchronized(this.field2894) {
            this.field2894.method1045(3);
         }

         if (arg0 <= -7) {
            ++field2889;
            class107 var3 = this.field2895;
            synchronized(this.field2895) {
               this.field2895.method1045(3);
            }
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2896[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "<init>",
      descriptor = "(Ltb;ILsa;Lsa;)V"
   )
   public class202(class392 arg0, int arg1, class39 arg2, class39 arg3) {
      try {
         this.field2891 = arg3;
         this.field2893 = arg2;
         this.field2893.method434((byte)-106, 36);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field2896[2] + (arg0 != null ? field2896[3] : field2896[4]) + ',' + arg1 + ',' + (arg2 != null ? field2896[3] : field2896[4]) + ',' + (arg3 != null ? field2896[3] : field2896[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1758(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1759(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
