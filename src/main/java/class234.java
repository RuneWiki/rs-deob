import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class234 {
   @OriginalMember(
      owner = "client!qb",
      name = "f",
      descriptor = "I"
   )
   public int field2974;
   @OriginalMember(
      owner = "client!qb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2980 = new String[]{method1760(method1759("1}5_R")), method1760(method1759("1}5]R")), method1760(method1759("1}5\"\u0013.vo R")), method1760(method1759("1}5ZR")), method1760(method1759("1}5[R")), method1760(method1759("1}5j\u0015\u0013kiw\u0014'7")), method1760(method1759(";150\u0007")), method1760(method1759("1}5XR")), method1760(method1759(".jwr"))};
   @OriginalMember(
      owner = "client!qb",
      name = "d",
      descriptor = "Lsda;"
   )
   public static class269 field2973 = new class269(10, -1);
   @OriginalMember(
      owner = "client!qb",
      name = "e",
      descriptor = "I"
   )
   public static int field2972;
   @OriginalMember(
      owner = "client!qb",
      name = "b",
      descriptor = "I"
   )
   public static int field2975;
   @OriginalMember(
      owner = "client!qb",
      name = "g",
      descriptor = "I"
   )
   public static int field2976;
   @OriginalMember(
      owner = "client!qb",
      name = "c",
      descriptor = "I"
   )
   public static int field2977;
   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "I"
   )
   public static int field2979;
   @OriginalMember(
      owner = "client!qb",
      name = "h",
      descriptor = "Lrh;"
   )
   public static class276 field2978;

   @OriginalMember(
      owner = "client!qb",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field2972;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2980[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1753(boolean arg0) {
      try {
         if (arg0) {
            field2973 = null;
         }

         field2978 = null;
         field2973 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2980[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(Ljj;ILfca;)Lcca;"
   )
   public static final class258 method1754(class128 arg0, int arg1, class91 arg2) {
      int var3 = client.field4530;

      try {
         ++field2979;
         class258 var4 = new class258(arg2);
         int var5 = arg0.method1104(arg1 + 255);
         boolean var6 = (1 & var5) != arg1;
         boolean var7 = (var5 & 2) != 0;
         boolean var8 = ~(var5 & 4) != -1;
         boolean var9 = (8 & var5) != 0;
         if (var6) {
            var4.field3493[0] = arg0.method1038((byte)-95);
            var4.field3494[0] = arg0.method1038((byte)-109);
            if (~arg2.field1136 != 0 || arg2.field1143 != -1) {
               var4.field3493[1] = arg0.method1038((byte)-114);
               var4.field3494[1] = arg0.method1038((byte)-111);
            }

            if (~arg2.field1108 != 0 || arg2.field1086 != -1) {
               var4.field3493[2] = arg0.method1038((byte)-93);
               var4.field3494[2] = arg0.method1038((byte)-112);
            }
         }

         if (var7) {
            var4.field3490[0] = arg0.method1038((byte)-104);
            var4.field3497[0] = arg0.method1038((byte)-111);
            if (~arg2.field1160 != 0 || ~arg2.field1124 != 0) {
               var4.field3490[1] = arg0.method1038((byte)-103);
               var4.field3497[1] = arg0.method1038((byte)-124);
            }
         }

         if (var8) {
            int var10 = arg0.method1038((byte)-94);
            int[] var11 = new int[]{class153.method1262(15, var10), class153.method1262(15, var10 >> 4), class153.method1262(3941, var10) >> 8, class153.method1262(var10, 62967) >> 12};
            int var12 = 0;
            if (var3 != 0 || ~var12 > -5) {
               do {
                  if (var11[var12] != 15) {
                     var4.field3496[var11[var12]] = (short)arg0.method1038((byte)-110);
                  }

                  ++var12;
               } while(~var12 > -5);
            }
         }

         if (var9) {
            int var13 = arg0.method1104(arg1 ^ 255);
            int[] var14 = new int[]{class153.method1262(var13, 15), class153.method1262(15, var13 >> 4)};
            int var15 = 0;
            if (var3 != 0 || var15 < 2) {
               do {
                  if (var14[var15] != 15) {
                     var4.field3492[var14[var15]] = (short)arg0.method1038((byte)-125);
                  }

                  ++var15;
               } while(var15 < 2);
            }
         }

         return var4;
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field2980[7] + (arg0 != null ? field2980[6] : field2980[8]) + ',' + arg1 + ',' + (arg2 != null ? field2980[6] : field2980[8]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method1755(int arg0, int arg1, int arg2) {
      try {
         ++field2976;
         if (arg1 == -1) {
            return 12345678;
         } else {
            arg0 = (arg1 & 127) * arg0 >> 7;
            if (arg2 != -13100) {
               method1755(98, 115, 21);
            }

            if (~arg0 > -3) {
               arg0 = 2;
               if (client.field4530 == 0) {
                  return (arg1 & 65408) + arg0;
               }
            }

            if (~arg0 < -127) {
               arg0 = 126;
            }

            return (arg1 & 65408) + arg0;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2980[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1756(int arg0, int arg1) {
      try {
         ++field2975;
         if (arg0 != 10163) {
            field2978 = null;
         }

         class686.field10293.method5453(arg1, false);
         class466.field6990.method5453(arg1, false);
         class781.field11392.method5453(arg1, false);
         class537.field7854.method5453(arg1, false);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2980[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(Lr;III[Z)V"
   )
   public static final void method1757(class193 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
      if (class650.field9484 != class377.field5711) {
         int var5 = class147.field1843[arg1].method2236((byte)109, arg2, arg3);

         for(int var6 = 0; var6 <= arg1; ++var6) {
            if (arg4 == null || arg4[var6]) {
               class293 var7 = class147.field1843[var6];
               if (var7 != null) {
                  var7.method787(arg0, arg2, var5 - var7.method2236((byte)114, arg2, arg3), arg3, 0, false);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!qb",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class234(int arg0) {
      try {
         this.field2974 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2980[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qb",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1758(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!qb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1759(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1760(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 27;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
