import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public class class414 extends class247 {
   @OriginalMember(
      owner = "client!vja",
      name = "s",
      descriptor = "I"
   )
   public int field6076;
   @OriginalMember(
      owner = "client!vja",
      name = "r",
      descriptor = "I"
   )
   public int field6069;
   @OriginalMember(
      owner = "client!vja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6080 = new String[]{method3244(method3243("\u000e/&W\u0013P")), method3244(method3243("\u000e/&Wk\u0011+.\riP")), method3244(method3243("\u000e/&W\u0015P")), method3244(method3243("\u000e/&W\u0014P")), method3244(method3243("\u000e/&W\u001fP")), method3244(method3243("\u000e/&W\u001dP")), method3244(method3243("\u000e/&W\u001eP")), method3244(method3243("\u000e/&W\u0010P")), method3244(method3243("\u00160+\u0015")), method3244(method3243("\u0003kiW*")), method3244(method3243("\u000e/&W\u0016P")), method3244(method3243("\u000e/&W\u0011P")), method3244(method3243("\u000e/&W\u0012P"))};
   @OriginalMember(
      owner = "client!vja",
      name = "p",
      descriptor = "[Z"
   )
   public static boolean[] field6067 = new boolean[8];
   @OriginalMember(
      owner = "client!vja",
      name = "v",
      descriptor = "I"
   )
   public static int field6068;
   @OriginalMember(
      owner = "client!vja",
      name = "k",
      descriptor = "I"
   )
   public static int field6070;
   @OriginalMember(
      owner = "client!vja",
      name = "o",
      descriptor = "I"
   )
   public static int field6071;
   @OriginalMember(
      owner = "client!vja",
      name = "u",
      descriptor = "I"
   )
   public static int field6072;
   @OriginalMember(
      owner = "client!vja",
      name = "m",
      descriptor = "I"
   )
   public static int field6073;
   @OriginalMember(
      owner = "client!vja",
      name = "t",
      descriptor = "I"
   )
   public static int field6074;
   @OriginalMember(
      owner = "client!vja",
      name = "j",
      descriptor = "I"
   )
   public static int field6075;
   @OriginalMember(
      owner = "client!vja",
      name = "l",
      descriptor = "I"
   )
   public static int field6077;
   @OriginalMember(
      owner = "client!vja",
      name = "q",
      descriptor = "I"
   )
   public static int field6078;
   @OriginalMember(
      owner = "client!vja",
      name = "n",
      descriptor = "I"
   )
   public static int field6079;

   @OriginalMember(
      owner = "client!vja",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method3233(byte arg0) {
      try {
         ++field6078;
         if (arg0 >= -96) {
            return false;
         } else {
            return (this.field6076 & 4669010) >> 22 != 0;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6080[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method3234(byte arg0) {
      try {
         ++field6071;
         if (arg0 != 65) {
            method3236(8, true);
         }

         return ~(1 & this.field6076) != -1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6080[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method3235(byte arg0) {
      try {
         ++field6079;
         return arg0 != 42 ? 96 : 7 & this.field6076 >> 18;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6080[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(IZ)I"
   )
   public static final int method3236(int arg0, boolean arg1) {
      try {
         ++field6077;
         if (!arg1) {
            method3239((byte)-49);
         }

         return arg0 >>> 10;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6080[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(ZILjava/lang/String;ZZLjava/lang/String;I)V"
   )
   public static final void method3237(boolean param0, int param1, String param2, boolean param3, boolean param4, String param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method3238(int arg0) {
      try {
         ++field6075;
         if (arg0 >= -67) {
            method3242((byte)-3);
         }

         return class101.method998(-31020, this.field6076);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6080[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "e",
      descriptor = "(B)V"
   )
   public static void method3239(byte arg0) {
      try {
         int var1 = 107 % ((-71 - arg0) / 37);
         field6067 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6080[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method3240(int arg0) {
      try {
         ++field6074;
         if (arg0 != 0) {
            this.method3233((byte)101);
         }

         return (1 & this.field6076 >> 21) != 0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6080[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class414(int arg0, int arg1) {
      try {
         this.field6076 = arg0;
         this.field6069 = arg1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6080[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(II)Z"
   )
   public final boolean method3241(int arg0, int arg1) {
      try {
         if (arg1 != -15719) {
            this.method3233((byte)-93);
         }

         ++field6068;
         return ~(this.field6076 >> arg0 + 1 & 1) != -1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6080[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "f",
      descriptor = "(B)V"
   )
   public static final void method3242(byte arg0) {
      try {
         if (arg0 >= -72) {
            method3237(false, -100, (String)null, false, false, (String)null, -113);
         }

         if (class720.field10318.field1275 && ~class195.field2819.field2262 != 0) {
            class14.method119(class195.field2819.field2262, 6410, class195.field2819.field2258);
         }

         ++field6070;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6080[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3243(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3244(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
