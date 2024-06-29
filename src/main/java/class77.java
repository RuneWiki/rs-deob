import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class77 extends class147 {
   @OriginalMember(
      owner = "client!sh",
      name = "Tb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field964 = new String[]{method704(method703("cm%\\\u001e")), method704(method703("cm%[\u001e")), method704(method703("cm%X\u001e")), method704(method703("cm%]\u001e"))};
   @OriginalMember(
      owner = "client!sh",
      name = "Mb",
      descriptor = "[I"
   )
   public static int[] field961 = new int[16];
   @OriginalMember(
      owner = "client!sh",
      name = "Rb",
      descriptor = "Leg;"
   )
   public static class118 field959 = new class118(54, 0);
   @OriginalMember(
      owner = "client!sh",
      name = "Ob",
      descriptor = "I"
   )
   public static int field957;
   @OriginalMember(
      owner = "client!sh",
      name = "Sb",
      descriptor = "I"
   )
   public static int field958;
   @OriginalMember(
      owner = "client!sh",
      name = "Qb",
      descriptor = "I"
   )
   public static int field963;
   @OriginalMember(
      owner = "client!sh",
      name = "Nb",
      descriptor = "Lkf;"
   )
   public static class266 field960;
   @OriginalMember(
      owner = "client!sh",
      name = "Pb",
      descriptor = "[I"
   )
   public static int[] field962;

   @OriginalMember(
      owner = "client!sh",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class77(int arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!sh",
      name = "q",
      descriptor = "(B)V"
   )
   public static final void method698(byte arg0) {
      try {
         ++field963;
         if (arg0 != 116) {
            method702(-102, 58, -8, (Class)null);
         }

         if (class236.field3292 != null) {
            if (class236.field3292.field4078 == 1) {
               class236.field3292 = null;
               return;
            }

            if (~class236.field3292.field4078 == -3) {
               class573.method4127(class773.field11362, 2, class294.field4055, arg0 ^ 61);
               class236.field3292 = null;
               return;
            }
         }

      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field964[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(FB)V"
   )
   public final void method699(float arg0, byte arg1) {
      try {
         ++field957;
         int var3 = Stream.floatToRawIntBits(arg0);
         super.field1889[super.field1856++] = (byte)var3;
         super.field1889[super.field1856++] = (byte)(var3 >> 8);
         super.field1889[super.field1856++] = (byte)(var3 >> 16);
         if (arg1 <= 121) {
            field960 = null;
         }

         super.field1889[super.field1856++] = (byte)(var3 >> 24);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field964[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "p",
      descriptor = "(B)V"
   )
   public static void method700(byte arg0) {
      try {
         field959 = null;
         field961 = null;
         if (arg0 <= 108) {
            field960 = null;
         }

         field960 = null;
         field962 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field964[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(FI)V"
   )
   public final void method701(float arg0, int arg1) {
      try {
         ++field958;
         if (arg1 != 1871583144) {
            field962 = null;
         }

         int var3 = Stream.floatToRawIntBits(arg0);
         super.field1889[super.field1856++] = (byte)(var3 >> 24);
         super.field1889[super.field1856++] = (byte)(var3 >> 16);
         super.field1889[super.field1856++] = (byte)(var3 >> 8);
         super.field1889[super.field1856++] = (byte)var3;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field964[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "a",
      descriptor = "(IIILjava/lang/Class;)V"
   )
   public static final void method702(int arg0, int arg1, int arg2, Class arg3) {
      class517 var4 = class663.field9659[arg0][arg1][arg2];
      if (var4 != null) {
         for(class772 var5 = var4.field7468; var5 != null; var5 = var5.field11354) {
            class627 var6 = var5.field11352;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field9207 == arg1 && var6.field9208 == arg2) {
               class682.method4973(var6, false);
               return;
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!sh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method703(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method704(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
