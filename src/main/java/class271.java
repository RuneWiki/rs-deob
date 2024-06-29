import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class271 {
   @OriginalMember(
      owner = "client!cp",
      name = "c",
      descriptor = "[I"
   )
   public int[] field3470;
   @OriginalMember(
      owner = "client!cp",
      name = "b",
      descriptor = "[S"
   )
   public short[] field3474;
   @OriginalMember(
      owner = "client!cp",
      name = "f",
      descriptor = "[S"
   )
   public short[] field3476;
   @OriginalMember(
      owner = "client!cp",
      name = "e",
      descriptor = "J"
   )
   public long field3471;
   @OriginalMember(
      owner = "client!cp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3477 = new String[]{method2157(method2156("\tTLq")), method2157(method2156("\u001c\u000f\u000e3\f")), method2157(method2156("\u0004Q\u000e_Y")), method2157(method2156("\u0004Q\u000e^Y")), method2157(method2156("\u0004Q\u000e\\Y")), method2157(method2156("\u0004Q\u000e!\u0018\tHT#Y"))};
   @OriginalMember(
      owner = "client!cp",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field3469 = new int[]{0, -1, 0, 1};
   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field3473 = new String[]{method2157(method2156("\u0002O")), method2157(method2156("\u0003D")), method2157(method2156("\u0001S")), method2157(method2156("\u0017U")), method2157(method2156("\tM"))};
   @OriginalMember(
      owner = "client!cp",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field3472 = new int[1000];
   @OriginalMember(
      owner = "client!cp",
      name = "g",
      descriptor = "I"
   )
   public static int field3468;
   @OriginalMember(
      owner = "client!cp",
      name = "d",
      descriptor = "I"
   )
   public static int field3475;

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2152(int arg0) {
      try {
         if (arg0 > -70) {
            method2154((byte)-46, (byte[])null, 2, -20);
         }

         field3472 = null;
         field3473 = null;
         field3469 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3477[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method2153(int arg0, int arg1) {
      try {
         ++field3468;
         class732.field10658 = arg0;
         if (arg1 != 63) {
            method2153(-103, -42);
         }

         class151.field1879.method3201((byte)-22);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3477[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(B[BII)Ljava/lang/String;"
   )
   public static final String method2154(byte arg0, byte[] arg1, int arg2, int arg3) {
      boolean var4 = client.field1481;

      try {
         ++field3475;
         if (arg0 < 16) {
            field3472 = null;
         }

         char[] var5 = new char[arg3];
         int var6 = 0;
         int var7 = 0;
         if (!var4 && ~var7 <= ~arg3) {
            return new String(var5, 0, var6);
         } else {
            do {
               int var8 = 255 & arg1[arg2 + var7];
               if (var8 != 0) {
                  if (~var8 <= -129 && ~var8 > -161) {
                     char var9 = class497.field6956[var8 + -128];
                     if (~var9 == -1) {
                        var9 = '?';
                     }

                     var8 = var9;
                  }

                  var5[var6++] = (char)var8;
               }

               ++var7;
            } while(~var7 > ~arg3);

            return new String(var5, 0, var6);
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field3477[2] + arg0 + ',' + (arg1 != null ? field3477[1] : field3477[0]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(IIILjava/lang/Class;)V"
   )
   public static final void method2155(int arg0, int arg1, int arg2, Class arg3) {
      class731 var4 = class548.field8080[arg0][arg1][arg2];
      if (var4 != null) {
         for(class131 var5 = var4.field10654; var5 != null; var5 = var5.field1670) {
            class680 var6 = var5.field1676;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field10010 == arg1 && var6.field10011 == arg2) {
               class663.method4843(var6, false);
               return;
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "<init>",
      descriptor = "(J[I[S[S)V"
   )
   public class271(long arg0, int[] arg1, short[] arg2, short[] arg3) {
      try {
         this.field3470 = arg1;
         this.field3474 = arg3;
         this.field3476 = arg2;
         this.field3471 = arg0;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3477[5] + arg0 + ',' + (arg1 != null ? field3477[1] : field3477[0]) + ',' + (arg2 != null ? field3477[1] : field3477[0]) + ',' + (arg3 != null ? field3477[1] : field3477[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "<init>",
      descriptor = "()V"
   )
   protected class271() {
   }

   @OriginalMember(
      owner = "client!cp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2156(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2157(char[] arg0) {
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
            var10005 = 33;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
