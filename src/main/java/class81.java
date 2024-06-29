import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class81 extends class601 {
   @OriginalMember(
      owner = "client!u",
      name = "L",
      descriptor = "Z"
   )
   public boolean field1055;
   @OriginalMember(
      owner = "client!u",
      name = "O",
      descriptor = "F"
   )
   public float field1064;
   @OriginalMember(
      owner = "client!u",
      name = "Q",
      descriptor = "F"
   )
   public float field1058;
   @OriginalMember(
      owner = "client!u",
      name = "J",
      descriptor = "I"
   )
   public int field1060;
   @OriginalMember(
      owner = "client!u",
      name = "H",
      descriptor = "I"
   )
   public int field1065;
   @OriginalMember(
      owner = "client!u",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1066 = new String[]{method739(method738("\u001fB\u0005\u0007;\u0003\u0018\u0007F")), method739(method738("\u0011B\u0017@(")), method739(method738("\u0004\u0019U\u0002")), method739(method738("\u001fBuF")), method739(method738("\u001fBsF")), method739(method738("\u001fBpF")), method739(method738("\u001fBrF"))};
   @OriginalMember(
      owner = "client!u",
      name = "K",
      descriptor = "Leg;"
   )
   public static class118 field1057 = new class118(88, -1);
   @OriginalMember(
      owner = "client!u",
      name = "N",
      descriptor = "I"
   )
   public static int field1061 = 0;
   @OriginalMember(
      owner = "client!u",
      name = "I",
      descriptor = "Leg;"
   )
   public static class118 field1059 = new class118(35, 8);
   @OriginalMember(
      owner = "client!u",
      name = "P",
      descriptor = "I"
   )
   public static int field1056;
   @OriginalMember(
      owner = "client!u",
      name = "M",
      descriptor = "I"
   )
   public static int field1062;
   @OriginalMember(
      owner = "client!u",
      name = "G",
      descriptor = "I"
   )
   public static int field1063;

   @OriginalMember(
      owner = "client!u",
      name = "<init>",
      descriptor = "(Lea;IIIZ[III)V",
      line = 3
   )
   public class81(class573 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
      super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);

      try {
         label28: {
            if (~super.field6938 == -34038) {
               this.field1055 = false;
               this.field1064 = (float)arg2;
               this.field1058 = (float)arg3;
               if (!client.field4360) {
                  break label28;
               }
            }

            this.field1064 = this.field1058 = 1.0F;
            this.field1055 = true;
         }

         this.field1060 = arg2;
         this.field1065 = arg3;
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field1066[0] + (arg0 != null ? field1066[1] : field1066[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1066[1] : field1066[2]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(III)I",
      line = 26
   )
   public static final int method734(int arg0, int arg1, int arg2) {
      try {
         label22: {
            ++field1063;
            arg2 = (arg1 & 127) * arg2 >> 7;
            if (arg2 >= 2) {
               if (arg2 <= 126) {
                  break label22;
               }

               arg2 = 126;
               if (!client.field4360) {
                  break label22;
               }
            }

            arg2 = 2;
         }

         if (arg0 != 1) {
            method736(83);
         }

         return (arg1 & 65408) + arg2;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1066[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "a",
      descriptor = "(Z)V",
      line = 50
   )
   public static void method735(boolean arg0) {
      try {
         field1059 = null;
         field1057 = null;
         if (arg0) {
            field1059 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1066[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "e",
      descriptor = "(I)V",
      line = 61
   )
   public static final void method736(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!u",
      name = "f",
      descriptor = "(I)V",
      line = 93
   )
   public static final void method737(int arg0) {
      try {
         ++field1062;
         if (!class368.field5040) {
            class480.field6887 += (-12.0F - class480.field6887) / 2.0F;
            class368.field5040 = true;
            class444.field6311 = true;
            if (arg0 != 0) {
               field1061 = -120;
            }
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1066[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "<init>",
      descriptor = "(Lea;IIIII[BI)V",
      line = 110
   )
   public class81(class573 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
      super(arg0, 3553, arg1, arg4, arg5);

      try {
         this.field1065 = arg3;
         this.field1060 = arg2;
         this.method4375(true, arg2, 0, 0, arg6, arg7, 3317, 0, arg3, 0);
         this.field1058 = (float)arg3 / (float)arg5;
         this.field1064 = (float)arg2 / (float)arg4;
         this.field1055 = false;
         this.method4372(false, false, (byte)82);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field1066[0] + (arg0 != null ? field1066[1] : field1066[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1066[1] : field1066[2]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "<init>",
      descriptor = "(Lea;IIIIIZ)V",
      line = 124
   )
   public class81(class573 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);

      try {
         label23: {
            if (~super.field6938 != -34038) {
               this.field1064 = this.field1058 = 1.0F;
               this.field1055 = true;
               if (!client.field4360) {
                  break label23;
               }
            }

            this.field1064 = (float)arg4;
            this.field1055 = false;
            this.field1058 = (float)arg5;
         }

         this.field1060 = arg4;
         this.field1065 = arg5;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field1066[0] + (arg0 != null ? field1066[1] : field1066[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "<init>",
      descriptor = "(Lea;IIIIZ[BI)V",
      line = 149
   )
   public class81(class573 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);

      try {
         label28: {
            this.field1065 = arg4;
            if (super.field6938 != 34037) {
               this.field1064 = this.field1058 = 1.0F;
               this.field1055 = true;
               if (!client.field4360) {
                  break label28;
               }
            }

            this.field1064 = (float)arg3;
            this.field1055 = false;
            this.field1058 = (float)arg4;
         }

         this.field1060 = arg3;
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field1066[0] + (arg0 != null ? field1066[1] : field1066[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field1066[1] : field1066[2]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "<init>",
      descriptor = "(Lea;IIIIIIZ)V",
      line = 170
   )
   public class81(class573 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
      super(arg0, 3553, arg1, arg2, arg5, arg6);

      try {
         this.field1060 = arg3;
         this.field1064 = (float)arg3 / (float)arg5;
         this.field1055 = false;
         this.field1058 = (float)arg4 / (float)arg6;
         this.field1065 = arg4;
         this.method4372(false, false, (byte)44);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field1066[0] + (arg0 != null ? field1066[1] : field1066[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "<init>",
      descriptor = "(Lea;IIII[I)V",
      line = 183
   )
   public class81(class573 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
      super(arg0, 3553, 6408, arg3, arg4);

      try {
         this.field1060 = arg1;
         this.field1065 = arg2;
         this.method4371(0, 0, arg1, arg2, arg5, true, false, 0, 0);
         this.field1058 = (float)arg2 / (float)arg4;
         this.field1055 = false;
         this.field1064 = (float)arg1 / (float)arg3;
         this.method4372(false, false, (byte)113);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field1066[0] + (arg0 != null ? field1066[1] : field1066[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1066[1] : field1066[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "<init>",
      descriptor = "(Lea;IIIII)V",
      line = 197
   )
   public class81(class573 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(arg0, 3553, arg1, arg4, arg5);

      try {
         this.field1065 = arg3;
         this.field1060 = arg2;
         this.field1055 = false;
         this.field1064 = (float)arg2 / (float)arg4;
         this.field1058 = (float)arg3 / (float)arg5;
         this.method4372(false, false, (byte)114);
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field1066[0] + (arg0 != null ? field1066[1] : field1066[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "<init>",
      descriptor = "(Lea;IIII)V",
      line = 210
   )
   public class81(class573 arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3, arg4);

      try {
         this.field1060 = arg3;
         this.field1065 = arg4;
         if (super.field6938 != 34037) {
            this.field1064 = this.field1058 = 1.0F;
            this.field1055 = true;
         } else {
            this.field1064 = (float)arg3;
            this.field1058 = (float)arg4;
            this.field1055 = false;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1066[0] + (arg0 != null ? field1066[1] : field1066[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!u",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method738(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!u",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method739(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
