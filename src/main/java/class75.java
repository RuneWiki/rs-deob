import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class75 {
   @OriginalMember(
      owner = "client!ifa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field992 = new String[]{method722(method721("Z\u0000\n\u001c\u001b\u001b")), method722(method721("Z\u0000\n\u001c-\\5\u001f@0]\u0001C"))};
   @OriginalMember(
      owner = "client!ifa",
      name = "b",
      descriptor = "Lse;"
   )
   public static class6 field989 = new class6(28, 8);
   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "B"
   )
   public static byte field990 = -6;
   @OriginalMember(
      owner = "client!ifa",
      name = "e",
      descriptor = "I"
   )
   public static int field987;
   @OriginalMember(
      owner = "client!ifa",
      name = "d",
      descriptor = "I"
   )
   public static int field988;
   @OriginalMember(
      owner = "client!ifa",
      name = "c",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field991;

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "(Lnl;IIIII)V"
   )
   public static final void method719(class713 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = true;
      int var7 = arg2;
      int var8 = arg2 + arg4;
      int var9 = arg3 - 1;
      int var10 = arg3 + arg5;

      for(int var11 = arg1; var11 <= arg1 + 1; ++var11) {
         if (class174.field2251 != var11) {
            for(int var12 = var7; var12 <= var8; ++var12) {
               if (var12 >= 0 && var12 < class137.field1743) {
                  for(int var13 = var9; var13 <= var10; ++var13) {
                     if (var13 >= 0 && var13 < class181.field2297 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                        class731 var14 = class548.field8080[var11][var12][var13];
                        if (var14 != null) {
                           int var15 = (class659.field9815[var11].method3284(-1, var12, var13) + class659.field9815[var11].method3284(-1, var12 + 1, var13) + class659.field9815[var11].method3284(-1, var12, var13 + 1) + class659.field9815[var11].method3284(-1, var12 + 1, var13 + 1)) / 4 - (class659.field9815[arg1].method3284(-1, arg2, arg3) + class659.field9815[arg1].method3284(-1, arg2 + 1, arg3) + class659.field9815[arg1].method3284(-1, arg2, arg3 + 1) + class659.field9815[arg1].method3284(-1, arg2 + 1, arg3 + 1)) / 4;
                           class30 var16 = var14.field10656;
                           class30 var17 = var14.field10642;
                           if (var16 != null && var16.method178(-1)) {
                              arg0.method183(class158.field2032, false, var6, var16, var15, (var12 - arg2) * class15.field276 + (1 - arg4) * class486.field6788, (var13 - arg3) * class15.field276 + (1 - arg5) * class486.field6788);
                           }

                           if (var17 != null && var17.method178(-1)) {
                              arg0.method183(class158.field2032, false, var6, var17, var15, (var12 - arg2) * class15.field276 + (1 - arg4) * class486.field6788, (var13 - arg3) * class15.field276 + (1 - arg5) * class486.field6788);
                           }

                           for(class131 var18 = var14.field10654; var18 != null; var18 = var18.field1670) {
                              class680 var19 = var18.field1676;
                              if (var19 != null && var19.method178(-1) && (var19.field10010 == var12 || var7 == var12) && (var19.field10011 == var13 || var9 == var13)) {
                                 int var20 = var19.field10015 - var19.field10010 + 1;
                                 int var21 = var19.field10020 - var19.field10011 + 1;
                                 arg0.method183(class158.field2032, false, var6, var19, var15, (var19.field10010 - arg2) * class15.field276 + (var20 - arg4) * class486.field6788, (var19.field10011 - arg3) * class15.field276 + (var21 - arg5) * class486.field6788);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var7;
            var6 = false;
         }
      }

   }

   @OriginalMember(
      owner = "client!ifa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method720(byte arg0) {
      try {
         field989 = null;
         field991 = null;
         if (arg0 != -108) {
            method719((class713)null, -51, 39, 7, -27, 39);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field992[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field988;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field992[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class75(int arg0, int arg1) {
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method721(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ifa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method722(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
