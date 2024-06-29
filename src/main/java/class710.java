import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class710 extends class22 {
   @OriginalMember(
      owner = "client!ag",
      name = "u",
      descriptor = "I"
   )
   public int field10322;
   @OriginalMember(
      owner = "client!ag",
      name = "k",
      descriptor = "I"
   )
   public int field10311;
   @OriginalMember(
      owner = "client!ag",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10324 = new String[]{method5169(method5168("w\u000f\u001eZ}")), method5169(method5168("w\u000f\u001eY}")), method5169(method5168("w\u000f\u001eR}")), method5169(method5168("w\u000f\u001eS}")), method5169(method5168("w\u000f\u001e]}")), method5169(method5168("-HF~'e\u0001_uh'S\u0010k4b\u0000\r4n6\f_v4\u007f\u0006\r")), method5169(method5168("c\u001bB\u007f:tU")), method5169(method5168("w\u000f\u001e^}")), method5169(method5168("r\u0007Sn8s\u0006D56y\u0007[r0+J")), method5169(method5168("u\u0007_p<s\u0000_h!")), method5169(method5168("w\u000f\u001eX}")), method5169(method5168("w\u000f\u001e\\}")), method5169(method5168("w\u000f\u001e_}")), method5169(method5168("w\u000f\u001e'<x\u0001D%}"))};
   @OriginalMember(
      owner = "client!ag",
      name = "v",
      descriptor = "[Lhv;"
   )
   public static class542[] field10321 = new class542[300];
   @OriginalMember(
      owner = "client!ag",
      name = "t",
      descriptor = "I"
   )
   public static int field10312;
   @OriginalMember(
      owner = "client!ag",
      name = "q",
      descriptor = "I"
   )
   public static int field10313;
   @OriginalMember(
      owner = "client!ag",
      name = "r",
      descriptor = "I"
   )
   public static int field10314;
   @OriginalMember(
      owner = "client!ag",
      name = "m",
      descriptor = "I"
   )
   public static int field10315;
   @OriginalMember(
      owner = "client!ag",
      name = "s",
      descriptor = "I"
   )
   public static int field10316;
   @OriginalMember(
      owner = "client!ag",
      name = "n",
      descriptor = "I"
   )
   public static int field10317;
   @OriginalMember(
      owner = "client!ag",
      name = "j",
      descriptor = "I"
   )
   public static int field10319;
   @OriginalMember(
      owner = "client!ag",
      name = "l",
      descriptor = "I"
   )
   public static int field10323;
   @OriginalMember(
      owner = "client!ag",
      name = "p",
      descriptor = "Lhw;"
   )
   public static class141 field10318;
   @OriginalMember(
      owner = "client!ag",
      name = "o",
      descriptor = "Ltn;"
   )
   public static class94 field10320;

   @OriginalMember(
      owner = "client!ag",
      name = "b",
      descriptor = "(Z)V",
      line = 3
   )
   public static void method5159(boolean arg0) {
      try {
         field10320 = null;
         if (arg0) {
            field10318 = null;
         }

         field10321 = null;
         field10318 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10324[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "c",
      descriptor = "(Z)I",
      line = 17
   )
   public final int method5160(boolean arg0) {
      try {
         ++field10323;
         if (arg0) {
            method5159(true);
         }

         return class140.method1309(this.field10311, 0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10324[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "f",
      descriptor = "(I)I",
      line = 30
   )
   public final int method5161(int arg0) {
      try {
         ++field10317;
         if (arg0 != -11745) {
            field10321 = null;
         }

         return 7 & this.field10311 >> 18;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10324[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "e",
      descriptor = "(I)Z",
      line = 43
   )
   public final boolean method5162(int arg0) {
      try {
         if (arg0 <= 20) {
            this.field10322 = -77;
         }

         ++field10319;
         return (3102926 & this.field10311) >> 21 != 0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10324[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(B)V",
      line = 57
   )
   public static final void method5163(byte arg0) {
      try {
         ++field10313;
         if (arg0 < 97) {
            method5166(false, 42);
         }

         if (class514.field7493 != null) {
            try {
               String var1 = class514.field7493.getParameter(field10324[9]);
               int var2 = -11745 + (int)(class57.method650(98) / 86400000L);
               String var3 = field10324[6] + var2 + field10324[5] + var1;
               class575.method4252(class514.field7493, 116, field10324[8] + var3 + "\"");
            } catch (Throwable var5) {
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field10324[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "b",
      descriptor = "(I)Z",
      line = 86
   )
   public final boolean method5164(int arg0) {
      try {
         ++field10316;
         if (arg0 != 1) {
            this.method5161(31);
         }

         return (this.field10311 >> 22 & 1) != 0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10324[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(II)Z",
      line = 100
   )
   public final boolean method5165(int arg0, int arg1) {
      try {
         if (arg0 != 1) {
            return true;
         } else {
            ++field10314;
            return (1 & this.field10311 >> arg1 + 1) != 0;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10324[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(ZI)V",
      line = 112
   )
   public static final void method5166(boolean arg0, int arg1) {
      try {
         ++field10315;
         class536 var2 = class108.method1038((long)arg1, 23, 9);
         if (arg0) {
            var2.method4013((byte)126);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10324[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "<init>",
      descriptor = "(II)V",
      line = 126
   )
   public class710(int arg0, int arg1) {
      try {
         this.field10322 = arg1;
         this.field10311 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10324[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "a",
      descriptor = "(I)Z",
      line = 136
   )
   public final boolean method5167(int arg0) {
      try {
         if (arg0 != -1) {
            method5163((byte)-30);
         }

         ++field10312;
         return ~(this.field10311 & 1) != -1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10324[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ag",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5168(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ag",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5169(char[] arg0) {
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
            var10005 = 104;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
