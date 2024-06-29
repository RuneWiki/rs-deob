import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class40 extends class684 {
   @OriginalMember(
      owner = "client!be",
      name = "R",
      descriptor = "I"
   )
   public int field458;
   @OriginalMember(
      owner = "client!be",
      name = "U",
      descriptor = "F"
   )
   public float field461;
   @OriginalMember(
      owner = "client!be",
      name = "K",
      descriptor = "F"
   )
   public float field467;
   @OriginalMember(
      owner = "client!be",
      name = "H",
      descriptor = "Z"
   )
   public boolean field469;
   @OriginalMember(
      owner = "client!be",
      name = "L",
      descriptor = "I"
   )
   public int field470;
   @OriginalMember(
      owner = "client!be",
      name = "V",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field472 = new String[]{method308(method307("{qR\u0012")), method308(method307("wa\u0010<\u0002=")), method308(method307("db")), method308(method307("n*\u0010P>")), method308(method307("wa\u0010B*{mJ@k")), method308(method307("wa\u0010*k")), method308(method307("wa\u0010+k")), method308(method307("wa\u0010(k")), method308(method307("wa\u0010?\u0002=")), method308(method307("wa\u0010)k"))};
   @OriginalMember(
      owner = "client!be",
      name = "I",
      descriptor = "[J"
   )
   public static long[] field466 = new long[100];
   @OriginalMember(
      owner = "client!be",
      name = "S",
      descriptor = "I"
   )
   public static int field459;
   @OriginalMember(
      owner = "client!be",
      name = "N",
      descriptor = "I"
   )
   public static int field460;
   @OriginalMember(
      owner = "client!be",
      name = "M",
      descriptor = "I"
   )
   public static int field462;
   @OriginalMember(
      owner = "client!be",
      name = "P",
      descriptor = "I"
   )
   public static int field463;
   @OriginalMember(
      owner = "client!be",
      name = "Q",
      descriptor = "I"
   )
   public static int field464;
   @OriginalMember(
      owner = "client!be",
      name = "T",
      descriptor = "I"
   )
   public static int field465;
   @OriginalMember(
      owner = "client!be",
      name = "J",
      descriptor = "I"
   )
   public static int field468;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!be",
      name = "O",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field471;

   @OriginalMember(
      owner = "client!be",
      name = "<init>",
      descriptor = "(Lor;IIIIIZ)V"
   )
   public class40(class670 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);

      try {
         label23: {
            this.field458 = arg5;
            if (super.field7876 == 34037) {
               this.field461 = (float)arg5;
               this.field467 = (float)arg4;
               this.field469 = false;
               if (!client.field4273) {
                  break label23;
               }
            }

            this.field467 = this.field461 = 1.0F;
            this.field469 = true;
         }

         this.field470 = arg4;
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field472[4] + (arg0 != null ? field472[3] : field472[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(ILha;I)Z"
   )
   public static final boolean method300(int param0, class65 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!be",
      name = "<init>",
      descriptor = "(Lor;IIIIIIZ)V"
   )
   public class40(class670 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
      super(arg0, 3553, arg1, arg2, arg5, arg6);

      try {
         this.field470 = arg3;
         this.field467 = (float)arg3 / (float)arg5;
         this.field461 = (float)arg4 / (float)arg6;
         this.field458 = arg4;
         this.field469 = false;
         this.method4998(10497, false, false);
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field472[4] + (arg0 != null ? field472[3] : field472[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(IIBII)V"
   )
   public static final void method301(int arg0, int arg1, byte arg2, int arg3, int arg4) {
      try {
         ++field459;
         class446 var5 = class635.method4607(114, (long)arg0 | (long)arg1 << 32, 19);
         var5.method3311(true);
         int var6 = -111 % ((arg2 - 37) / 40);
         var5.field6177 = arg4;
         var5.field6167 = arg3;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field472[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method302(int arg0) {
      try {
         field466 = null;
         if (arg0 != 12471) {
            method300(-47, (class65)null, -100);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field472[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method303(int arg0, int arg1) {
      try {
         if (arg0 == 2) {
            class770.field11093 = 1000000000L / (long)arg1;
            ++field460;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field472[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "<init>",
      descriptor = "(Lor;IIIZ[III)V"
   )
   public class40(class670 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
      super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);

      try {
         this.field470 = arg2;
         this.field458 = arg3;
         if (~super.field7876 != -34038) {
            this.field467 = this.field461 = 1.0F;
            this.field469 = true;
         } else {
            this.field461 = (float)arg3;
            this.field467 = (float)arg2;
            this.field469 = false;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field472[4] + (arg0 != null ? field472[3] : field472[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field472[3] : field472[0]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "<init>",
      descriptor = "(Lor;IIIII)V"
   )
   public class40(class670 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(arg0, 3553, arg1, arg4, arg5);

      try {
         this.field469 = false;
         this.field461 = (float)arg3 / (float)arg5;
         this.field467 = (float)arg2 / (float)arg4;
         this.field470 = arg2;
         this.field458 = arg3;
         this.method4998(10497, false, false);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field472[4] + (arg0 != null ? field472[3] : field472[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "<init>",
      descriptor = "(Lor;IIII[I)V"
   )
   public class40(class670 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
      super(arg0, 3553, 6408, arg3, arg4);

      try {
         this.field470 = arg1;
         this.field458 = arg2;
         this.method5001(true, arg5, arg2, arg1, 0, 0, 0, 0, 0);
         this.field461 = (float)arg2 / (float)arg4;
         this.field467 = (float)arg1 / (float)arg3;
         this.field469 = false;
         this.method4998(10497, false, false);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field472[4] + (arg0 != null ? field472[3] : field472[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field472[3] : field472[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(BIILd;Ljava/awt/Canvas;)Lha;"
   )
   public static final class65 method304(byte arg0, int arg1, int arg2, class160 arg3, Canvas arg4) {
      try {
         if (arg0 != -47) {
            return null;
         } else {
            ++field463;
            return new class725(arg4, arg3, arg2, arg1);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field472[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field472[3] : field472[0]) + ',' + (arg4 != null ? field472[3] : field472[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "<init>",
      descriptor = "(Lor;IIII)V"
   )
   public class40(class670 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         label23: {
            this.field470 = arg3;
            if (super.field7876 == 34037) {
               this.field467 = (float)arg3;
               this.field461 = (float)arg4;
               this.field469 = false;
               if (!client.field4273) {
                  break label23;
               }
            }

            this.field467 = this.field461 = 1.0F;
            this.field469 = true;
         }

         this.field458 = arg4;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field472[4] + (arg0 != null ? field472[3] : field472[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "<init>",
      descriptor = "(Lor;IIIII[BI)V"
   )
   public class40(class670 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
      super(arg0, 3553, arg1, arg4, arg5);

      try {
         this.field470 = arg2;
         this.field458 = arg3;
         this.method5000(arg3, arg7, arg6, 0, 0, arg2, 3314, true, 0, 0);
         this.field467 = (float)arg2 / (float)arg4;
         this.field461 = (float)arg3 / (float)arg5;
         this.field469 = false;
         this.method4998(10497, false, false);
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field472[4] + (arg0 != null ? field472[3] : field472[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field472[3] : field472[0]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "<init>",
      descriptor = "(Lor;IIIIZ[BI)V"
   )
   public class40(class670 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);

      try {
         this.field470 = arg3;
         this.field458 = arg4;
         if (super.field7876 != 34037) {
            this.field469 = true;
            this.field467 = this.field461 = 1.0F;
         } else {
            this.field461 = (float)arg4;
            this.field469 = false;
            this.field467 = (float)arg3;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field472[4] + (arg0 != null ? field472[3] : field472[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field472[3] : field472[0]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method305(int arg0, int arg1, int arg2) {
      try {
         ++field465;
         if (arg0 != 32768) {
            method304((byte)3, -11, 51, (class160)null, (Canvas)null);
         }

         return ~(32768 & arg1) != -1;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field472[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method306(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method307(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!be",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method308(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 21;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
