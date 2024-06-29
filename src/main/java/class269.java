import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class269 {
   @OriginalMember(
      owner = "client!sda",
      name = "d",
      descriptor = "I"
   )
   public int field3759;
   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "I"
   )
   private int field3757;
   @OriginalMember(
      owner = "client!sda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3763 = new String[]{method2083(method2082("l\u0000\u0002ug7")), method2083(method2082("dJMu[")), method2083(method2082("q\u0011\u000f7")), method2083(method2082("l\u0000\u0002ue7")), method2083(method2082("s\r\r.^")), method2083(method2082("1\u0017\f")), method2083(method2082("1\u0000\u000f7")), method2083(method2082("r\u0005\u0000")), method2083(method2082("h\r\r")), method2083(method2082("1\u0000\u001a7O}")), method2083(method2082("s\r\u0001")), method2083(method2082("l\u0000\u0002ub7")), method2083(method2082("l\u0000\u0002u\u001av\n\n/\u00187")), method2083(method2082("l\u0000\u0002ud7")), method2083(method2082("l\u0000\u0002uc7")), method2083(method2082("l\u0000\u0002uRp7\u0017)Oq\u0003K"))};
   @OriginalMember(
      owner = "client!sda",
      name = "c",
      descriptor = "I"
   )
   public static int field3752 = 0;
   @OriginalMember(
      owner = "client!sda",
      name = "f",
      descriptor = "I"
   )
   public static int field3761 = 0;
   @OriginalMember(
      owner = "client!sda",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field3760 = new int[64];
   @OriginalMember(
      owner = "client!sda",
      name = "b",
      descriptor = "I"
   )
   public static int field3754;
   @OriginalMember(
      owner = "client!sda",
      name = "k",
      descriptor = "I"
   )
   public static int field3755;
   @OriginalMember(
      owner = "client!sda",
      name = "h",
      descriptor = "I"
   )
   public static int field3756;
   @OriginalMember(
      owner = "client!sda",
      name = "g",
      descriptor = "I"
   )
   public static int field3758;
   @OriginalMember(
      owner = "client!sda",
      name = "j",
      descriptor = "I"
   )
   public static int field3762;
   @OriginalMember(
      owner = "client!sda",
      name = "e",
      descriptor = "Lffa;"
   )
   public static class196 field3753;

   @OriginalMember(
      owner = "client!sda",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 10
   )
   public final String toString() {
      try {
         ++field3754;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3763[15] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "(IIILsp;II)V",
      line = 20
   )
   public static final void method2077(int arg0, int arg1, int arg2, class661 arg3, int arg4, int arg5) {
      int var6 = client.field4530;

      try {
         ++field3758;
         class395 var7 = null;
         class395 var8 = (class395)class257.field3487.method4071((byte)126);
         if (var6 != 0 || var8 != null) {
            do {
               if (var8.field6007 == arg4 && var8.field6011 == arg2 && var8.field6010 == arg5 && var8.field6006 == arg0) {
                  var7 = var8;
                  break;
               }

               var8 = (class395)class257.field3487.method4059((byte)108);
            } while(var8 != null);
         }

         while(var6 != 0) {
         }

         if (var7 == null) {
            var7 = new class395();
            var7.field6010 = arg5;
            var7.field6007 = arg4;
            var7.field6006 = arg0;
            var7.field6011 = arg2;
            class257.field3487.method4060(23, var7);
         }

         var7.field6012 = arg3;
         if (arg1 == 64) {
            var7.field6013 = false;
            var7.field6002 = true;
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field3763[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3763[1] : field3763[2]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "(B)V",
      line = 58
   )
   public static void method2078(byte arg0) {
      try {
         field3753 = null;
         if (arg0 == -62) {
            field3760 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3763[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "(I)I",
      line = 70
   )
   public final int method2079(int arg0) {
      try {
         if (arg0 != 0) {
            method2081((String)null, false);
         }

         ++field3756;
         return this.field3757;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3763[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "b",
      descriptor = "(B)V",
      line = 87
   )
   public static final void method2080(byte arg0) {
      try {
         ++field3755;
         class622.field9064 = 200;
         if (arg0 >= 15) {
            class391.field5950 = (int)((double)class323.field4603 * 34.46D);
            class391.field5950 <<= 2;
            if (class786.field11439.method585()) {
               class391.field5950 += 512;
            }

            class746.method5436(false, (byte)35);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3763[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "<init>",
      descriptor = "(II)V",
      line = 110
   )
   public class269(int arg0, int arg1) {
      try {
         this.field3759 = arg1;
         this.field3757 = arg0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3763[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;",
      line = 119
   )
   public static final String method2081(String arg0, boolean arg1) {
      try {
         if (arg1) {
            return null;
         } else {
            ++field3762;
            if (class80.field990.startsWith(field3763[8])) {
               return arg0 + field3763[6];
            } else if (!class80.field990.startsWith(field3763[4])) {
               return class80.field990.startsWith(field3763[7]) ? field3763[10] + arg0 + field3763[9] : null;
            } else {
               return field3763[10] + arg0 + field3763[5];
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3763[11] + (arg0 != null ? field3763[1] : field3763[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2082(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2083(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
