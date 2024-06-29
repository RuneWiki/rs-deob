import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class207 extends class490 {
   @OriginalMember(
      owner = "client!pq",
      name = "u",
      descriptor = "I"
   )
   private int field2967;
   @OriginalMember(
      owner = "client!pq",
      name = "l",
      descriptor = "I"
   )
   private int field2968;
   @OriginalMember(
      owner = "client!pq",
      name = "r",
      descriptor = "I"
   )
   private int field2961;
   @OriginalMember(
      owner = "client!pq",
      name = "s",
      descriptor = "I"
   )
   private int field2963;
   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2970 = new String[]{method1648(method1647("\u001dD[8\u001d")), method1648(method1647("\u001dD[2\u001d")), method1648(method1647("\u0003@\u0019\u0017")), method1648(method1647("\u0016\u001b[UH")), method1648(method1647("\u001dD[?\u001d")), method1648(method1647("\u001dD[<\u001d")), method1648(method1647("\u001dD[3\u001d")), method1648(method1647("\u001dD[G\\\u0003\\\u0001E\u001d"))};
   @OriginalMember(
      owner = "client!pq",
      name = "p",
      descriptor = "F"
   )
   public static float field2962 = 0.25F;
   @OriginalMember(
      owner = "client!pq",
      name = "v",
      descriptor = "I"
   )
   public static int field2959;
   @OriginalMember(
      owner = "client!pq",
      name = "m",
      descriptor = "I"
   )
   public static int field2960;
   @OriginalMember(
      owner = "client!pq",
      name = "q",
      descriptor = "I"
   )
   public static int field2964;
   @OriginalMember(
      owner = "client!pq",
      name = "o",
      descriptor = "I"
   )
   public static int field2965;
   @OriginalMember(
      owner = "client!pq",
      name = "t",
      descriptor = "I"
   )
   public static int field2966;
   @OriginalMember(
      owner = "client!pq",
      name = "n",
      descriptor = "I"
   )
   public static int field2969;

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "([[F[[SI)[[S",
      line = 3
   )
   public static final short[][] method1642(float[][] arg0, short[][] arg1, int arg2) {
      boolean var3 = client.field4360;

      try {
         int var4 = arg2;
         int var10000;
         if (var3) {
            var10000 = 0;
         } else if (~arg2 <= ~arg0.length) {
            var10000 = field2965 + 1;
            if (!var3) {
               field2965 = var10000;
               return arg1;
            }
         } else {
            var10000 = 0;
         }

         while(true) {
            int var5 = var10000;
            if (var3) {
               arg1[var4][var5] = (short)((int)(arg0[var4][var5] * 16383.0F));
               ++var5;
            }

            while(true) {
               while(~arg1[var4].length < ~var5) {
                  arg1[var4][var5] = (short)((int)(arg0[var4][var5] * 16383.0F));
                  ++var5;
               }

               if (!var3) {
                  ++var4;
                  if (~var4 <= ~arg0.length) {
                     var10000 = field2965 + 1;
                     if (!var3) {
                        field2965 = var10000;
                        return arg1;
                     }
                  } else {
                     var10000 = 0;
                  }
                  break;
               }

               ++var5;
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field2970[1] + (arg0 != null ? field2970[3] : field2970[2]) + ',' + (arg1 != null ? field2970[3] : field2970[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(IIB)Z",
      line = 29
   )
   public static final boolean method1643(int arg0, int arg1, byte arg2) {
      try {
         ++field2960;
         if (arg2 != 60) {
            method1642((float[][])null, (short[][])null, 97);
         }

         return false;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2970[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "<init>",
      descriptor = "(IIIIII)V",
      line = 40
   )
   public class207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(-1, arg4, arg5);

      try {
         this.field2967 = arg1;
         this.field2968 = arg2;
         this.field2961 = arg0;
         this.field2963 = arg3;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field2970[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(BII)V",
      line = 53
   )
   public final void method1644(byte arg0, int arg1, int arg2) {
      try {
         int var4 = -54 / ((75 - arg0) / 40);
         ++field2969;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2970[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "c",
      descriptor = "(III)V",
      line = 66
   )
   public final void method1645(int arg0, int arg1, int arg2) {
      try {
         ++field2959;
         int var4 = this.field2961 * arg1 >> 12;
         int var5 = this.field2968 * arg1 >> 12;
         int var6 = this.field2967 * arg0 >> 12;
         int var7 = -36 / ((39 - arg2) / 45);
         int var8 = this.field2963 * arg0 >> 12;
         class57.method444(var5, var8, var4, super.field7012, var6, (byte)-96);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field2970[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "b",
      descriptor = "(III)V",
      line = 84
   )
   public final void method1646(int arg0, int arg1, int arg2) {
      try {
         ++field2964;
         if (arg0 != 30078) {
            this.method1646(-126, 66, 114);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2970[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1647(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1648(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
