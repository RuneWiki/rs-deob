import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class417 {
   @OriginalMember(
      owner = "client!sg",
      name = "c",
      descriptor = "Ldw;"
   )
   private class748 field6383 = new class748(64);
   @OriginalMember(
      owner = "client!sg",
      name = "m",
      descriptor = "Ldw;"
   )
   private class748 field6391 = new class748(100);
   @OriginalMember(
      owner = "client!sg",
      name = "l",
      descriptor = "Leaa;"
   )
   private class526 field6382;
   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6392 = new String[]{method3196(method3195("2X{=D")), method3196(method3195("2X{9D")), method3196(method3195("2X{>D")), method3196(method3195("2X{8D")), method3196(method3195("/J9\u0010")), method3196(method3195(":\u0011{R\u0011")), method3196(method3195("2X{;D")), method3196(method3195("2X{?D")), method3196(method3195(".O0\u0012\u00062")), method3196(method3195("2X{@\u0005/V!BD")), method3196(method3195("2X{:D")), method3196(method3195("a\u00036\u0013\u0000|Y3\u001a\n'YkB")), method3196(method3195("2X{5D")), method3196(method3195("2X{4D"))};
   @OriginalMember(
      owner = "client!sg",
      name = "k",
      descriptor = "Lwia;"
   )
   public static class791 field6385 = new class791(512);
   @OriginalMember(
      owner = "client!sg",
      name = "f",
      descriptor = "I"
   )
   public static int field6378;
   @OriginalMember(
      owner = "client!sg",
      name = "d",
      descriptor = "I"
   )
   public static int field6379;
   @OriginalMember(
      owner = "client!sg",
      name = "g",
      descriptor = "I"
   )
   public static int field6380;
   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "I"
   )
   public static int field6381;
   @OriginalMember(
      owner = "client!sg",
      name = "e",
      descriptor = "I"
   )
   public static int field6384;
   @OriginalMember(
      owner = "client!sg",
      name = "i",
      descriptor = "I"
   )
   public static int field6386;
   @OriginalMember(
      owner = "client!sg",
      name = "j",
      descriptor = "I"
   )
   public static int field6388;
   @OriginalMember(
      owner = "client!sg",
      name = "n",
      descriptor = "I"
   )
   public static int field6390;
   @OriginalMember(
      owner = "client!sg",
      name = "h",
      descriptor = "Lat;"
   )
   public static class396 field6387;
   @OriginalMember(
      owner = "client!sg",
      name = "b",
      descriptor = "Lpg;"
   )
   public static class763 field6389;

   @OriginalMember(
      owner = "client!sg",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3186(int arg0) {
      try {
         class748 var2 = this.field6383;
         synchronized(this.field6383) {
            this.field6383.method5451(-119);
            if (arg0 != 64) {
               this.method3186(-4);
            }
         }

         ++field6379;
         class748 var3 = this.field6391;
         synchronized(this.field6391) {
            this.field6391.method5451(-3);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6392[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3187(int arg0) {
      try {
         field6389 = null;
         field6385 = null;
         field6387 = null;
         if (arg0 >= -19) {
            method3193(15, (class488)null);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6392[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(ILeaa;)V"
   )
   public static final void method3188(int arg0, class526 arg1) {
      try {
         ++field6380;
         class260.field3547 = arg1;
         if (arg0 != 64) {
            field6385 = null;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6392[6] + arg0 + ',' + (arg1 != null ? field6392[5] : field6392[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(IB)Lpl;"
   )
   public final class676 method3189(int arg0, byte arg1) {
      try {
         ++field6378;
         class748 var3 = this.field6383;
         class676 var4;
         synchronized(this.field6383) {
            var4 = (class676)this.field6383.method5454((long)arg0, 18261);
         }

         if (var4 != null) {
            return var4;
         } else {
            class526 var5 = this.field6382;
            byte[] var6;
            synchronized(this.field6382) {
               var6 = this.field6382.method3899(-125, class140.method1187(arg0, 127), class410.method3129(arg0, (byte)-93));
            }

            class676 var7 = new class676();
            var7.field10173 = arg0;
            var7.field10155 = this;
            if (arg1 >= -31) {
               return null;
            } else {
               if (var6 != null) {
                  var7.method4935(5, new class128(var6));
               }

               var7.method4938(25447);
               class748 var8 = this.field6383;
               synchronized(this.field6383) {
                  this.field6383.method5455(-2049, var7, (long)arg0);
                  return var7;
               }
            }
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field6392[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(IILjava/lang/String;Lhg;)Ldaa;"
   )
   public static final class12 method3190(int arg0, int arg1, String arg2, class719 arg3) {
      try {
         int var4 = -83 % ((arg1 - -13) / 33);
         ++field6390;
         return class106.method917(arg2, (byte)109, arg3, arg0, field6392[8]);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field6392[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6392[5] : field6392[4]) + ',' + (arg3 != null ? field6392[5] : field6392[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3191(byte arg0) {
      try {
         class748 var2 = this.field6383;
         synchronized(this.field6383) {
            this.field6383.method5445(arg0 + 697465548);
         }

         ++field6381;
         class748 var3 = this.field6391;
         synchronized(this.field6391) {
            this.field6391.method5445(arg0 ^ -697465388);
         }

         if (arg0 != -122) {
            method3188(-86, (class526)null);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6392[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "b",
      descriptor = "(II)Lmba;"
   )
   public final class441 method3192(int arg0, int arg1) {
      try {
         if (arg0 != -28532) {
            this.method3191((byte)24);
         }

         ++field6388;
         class748 var3 = this.field6391;
         synchronized(this.field6391) {
            class441 var4 = (class441)this.field6391.method5454((long)arg1, 18261);
            if (var4 == null) {
               var4 = new class441(arg1);
               this.field6391.method5455(-2049, var4, (long)arg1);
            }

            return !var4.method3333((byte)-54) ? null : var4;
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field6392[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(ILch;)Ljava/lang/String;"
   )
   public static final String method3193(int arg0, class488 arg1) {
      try {
         ++field6386;
         if (arg0 != -32167) {
            method3188(96, (class526)null);
         }

         return arg1.field7213 + field6392[11];
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6392[10] + arg0 + ',' + (arg1 != null ? field6392[5] : field6392[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3194(int arg0, int arg1) {
      try {
         ++field6384;
         class748 var3 = this.field6383;
         synchronized(this.field6383) {
            this.field6383.method5453(arg0, false);
            if (arg1 != 100) {
               this.field6382 = null;
            }
         }

         class748 var4 = this.field6391;
         synchronized(this.field6391) {
            this.field6391.method5453(arg0, false);
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field6392[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;Leaa;Leaa;)V"
   )
   public class417(class24 arg0, int arg1, class526 arg2, class526 arg3, class526 arg4) {
      try {
         this.field6382 = arg2;
         if (this.field6382 != null) {
            int var6 = this.field6382.method3903((byte)106) + -1;
            this.field6382.method3875(0, var6);
         }

         class397.method3056(-8618, 2, arg3, arg4);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field6392[9] + (arg0 != null ? field6392[5] : field6392[4]) + ',' + arg1 + ',' + (arg2 != null ? field6392[5] : field6392[4]) + ',' + (arg3 != null ? field6392[5] : field6392[4]) + ',' + (arg4 != null ? field6392[5] : field6392[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3195(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3196(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 63;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
