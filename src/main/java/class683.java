import jaclib.memory.Buffer;
import jaclib.memory.Source;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.MapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class class683 implements class537 {
   @OriginalMember(
      owner = "client!mj",
      name = "f",
      descriptor = "I"
   )
   private int field10052 = 0;
   @OriginalMember(
      owner = "client!mj",
      name = "p",
      descriptor = "I"
   )
   private int field10066 = -1;
   @OriginalMember(
      owner = "client!mj",
      name = "m",
      descriptor = "I"
   )
   private int field10065;
   @OriginalMember(
      owner = "client!mj",
      name = "d",
      descriptor = "Z"
   )
   private boolean field10063;
   @OriginalMember(
      owner = "client!mj",
      name = "n",
      descriptor = "Lwi;"
   )
   public class494 field10047;
   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10067 = new String[]{method4986(method4985("Gc6\u0017+")), method4986(method4985("Q'6h~")), method4986(method4985("D|t*")), method4986(method4985("Gc6\u0016+")), method4986(method4985("Gc6zjD`lx+")), method4986(method4985("Gc6\u0001+")), method4986(method4985("Gc6\u0012+")), method4986(method4985("Gc6\t+")), method4986(method4985("Gc6\b+")), method4986(method4985("Gc6\u0014+")), method4986(method4985("Gc6 jDht/yO!")), method4986(method4985("Gc6\u0015+")), method4986(method4985("Gc6\f+")), method4986(method4985("Gc6\u0007+")), method4986(method4985("Gc6\u000b+")), method4986(method4985("k[_\u000e\""))};
   @OriginalMember(
      owner = "client!mj",
      name = "r",
      descriptor = "I"
   )
   public static int field10050 = 1;
   @OriginalMember(
      owner = "client!mj",
      name = "c",
      descriptor = "I"
   )
   public static int field10046;
   @OriginalMember(
      owner = "client!mj",
      name = "j",
      descriptor = "I"
   )
   public static int field10048;
   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "I"
   )
   public static int field10049;
   @OriginalMember(
      owner = "client!mj",
      name = "b",
      descriptor = "I"
   )
   public static int field10051;
   @OriginalMember(
      owner = "client!mj",
      name = "l",
      descriptor = "I"
   )
   public static int field10053;
   @OriginalMember(
      owner = "client!mj",
      name = "k",
      descriptor = "I"
   )
   private int field10054;
   @OriginalMember(
      owner = "client!mj",
      name = "i",
      descriptor = "I"
   )
   public static int field10055;
   @OriginalMember(
      owner = "client!mj",
      name = "g",
      descriptor = "I"
   )
   public static int field10056;
   @OriginalMember(
      owner = "client!mj",
      name = "h",
      descriptor = "I"
   )
   public static int field10059;
   @OriginalMember(
      owner = "client!mj",
      name = "u",
      descriptor = "I"
   )
   public static int field10060;
   @OriginalMember(
      owner = "client!mj",
      name = "t",
      descriptor = "I"
   )
   public static int field10061;
   @OriginalMember(
      owner = "client!mj",
      name = "e",
      descriptor = "I"
   )
   public static int field10062;
   @OriginalMember(
      owner = "client!mj",
      name = "q",
      descriptor = "I"
   )
   private int field10064;
   @OriginalMember(
      owner = "client!mj",
      name = "o",
      descriptor = "Lkf;"
   )
   public static class266 field10045;
   @OriginalMember(
      owner = "client!mj",
      name = "v",
      descriptor = "Lic;"
   )
   public static class729 field10057;
   @OriginalMember(
      owner = "client!mj",
      name = "s",
      descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;"
   )
   private NativeHeapBuffer field10058;

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(BLjaclib/memory/Source;I)Z"
   )
   public final boolean method4977(byte arg0, Source arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         if (arg0 != -104) {
            return true;
         } else {
            label53: {
               ++field10053;
               if (~this.field10064 <= ~arg2) {
                  if (~this.field10066 >= -1) {
                     throw new RuntimeException(field10067[15]);
                  }

                  OpenGL.glBindBufferARB(this.field10065, this.field10066);
                  OpenGL.glBufferSubDataARBa(this.field10065, 0, this.field10054, arg1.getAddress());
                  this.field10047.field5234 += -this.field10054 + arg2;
                  if (!var4) {
                     break label53;
                  }
               }

               this.method4979(arg0 ^ -103);
               if (this.field10066 <= 0) {
                  throw new RuntimeException(field10067[15]);
               }

               OpenGL.glBindBufferARB(this.field10065, this.field10066);
               OpenGL.glBufferDataARBa(this.field10065, arg2, arg1.getAddress(), !this.field10063 ? 35044 : 35040);
               this.field10047.field5234 += -this.field10054 + arg2;
               if (var4) {
                  throw new RuntimeException(field10067[15]);
               }

               this.field10064 = arg2;
            }

            this.field10054 = arg2;
            return true;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field10067[14] + arg0 + ',' + (arg1 != null ? field10067[1] : field10067[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4978(int arg0) {
      try {
         field10045 = null;
         if (arg0 != 0) {
            field10050 = -101;
         }

         field10057 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10067[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(Z)I"
   )
   public int method1408(boolean arg0) {
      try {
         if (!arg0) {
            this.field10058 = null;
         }

         ++field10059;
         return this.field10054;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10067[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "g",
      descriptor = "(I)V"
   )
   private final void method4979(int arg0) {
      try {
         ++field10056;
         if (arg0 == 1) {
            if (~this.field10066 > -1) {
               if (!this.field10047.field7162) {
                  this.field10066 = 0;
               } else {
                  OpenGL.glGenBuffersARB(1, class212.field3034, 0);
                  this.field10066 = class212.field3034[0];
                  OpenGL.glBindBufferARB(this.field10065, this.field10066);
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10067[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(IJ)V"
   )
   public static final void method4980(int arg0, long arg1) {
      try {
         try {
            if (arg0 != 35044) {
               method4980(4, -106L);
            }

            Thread.sleep(arg1);
         } catch (InterruptedException var4) {
         }

         ++field10046;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10067[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method4981(int arg0) {
      try {
         if (arg0 == -10365) {
            if (this.field10047.field7162) {
               OpenGL.glBindBufferARB(this.field10065, this.field10066);
            }

            ++field10048;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10067[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(ZLjaggl/MapBuffer;)Z"
   )
   public final boolean method4982(boolean arg0, MapBuffer arg1) {
      try {
         ++field10060;
         boolean var3 = arg0;
         if (~this.field10052 != -1) {
            if (~this.field10066 < -1) {
               label34: {
                  OpenGL.glBindBufferARB(this.field10065, this.field10066);
                  if (~this.field10052 != -2) {
                     var3 = arg1.method4794();
                     if (!client.field4360) {
                        break label34;
                     }
                  }

                  OpenGL.glBufferSubDataARBa(this.field10065, 0, this.field10064, this.field10047.field5125.getAddress());
               }
            }

            this.field10052 = 0;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10067[0] + arg0 + ',' + (arg1 != null ? field10067[1] : field10067[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(II)V"
   )
   public void method2281(int arg0, int arg1) {
      try {
         if (arg0 == -4657) {
            ++field10061;
            if (~arg1 < ~this.field10064) {
               label35: {
                  this.method4979(arg0 + 4658);
                  if (~this.field10066 >= -1) {
                     this.field10058 = this.field10047.method2765(false, arg1, 99);
                     if (!client.field4360) {
                        break label35;
                     }
                  }

                  OpenGL.glBindBufferARB(this.field10065, this.field10066);
                  OpenGL.glBufferDataARBub(this.field10065, arg1, (byte[])null, 0, !this.field10063 ? 35044 : 35040);
                  this.field10047.field5234 += -this.field10064 + arg1;
               }

               this.field10064 = arg1;
            }

            this.field10054 = arg1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field10067[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field10049;
         this.method1412(115);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field10067[10] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(I)V"
   )
   public void method1412(int arg0) {
      try {
         if (this.field10066 > 0) {
            this.field10047.method3594((byte)59, this.field10066, this.field10054);
            this.field10066 = -1;
         }

         ++field10051;
         if (arg0 <= 6) {
            this.method1408(false);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10067[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "e",
      descriptor = "(I)J"
   )
   public final long method4983(int arg0) {
      try {
         if (arg0 != 0) {
            this.method4979(-69);
         }

         ++field10055;
         return ~this.field10066 != -1 ? 0L : this.field10058.getAddress();
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10067[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "a",
      descriptor = "(ZBLjaggl/MapBuffer;)Ljaclib/memory/Buffer;"
   )
   public final Buffer method4984(boolean arg0, byte arg1, MapBuffer arg2) {
      try {
         if (arg1 != -41) {
            return null;
         } else {
            ++field10062;
            if (~this.field10052 == -1) {
               this.method4979(1);
               if (~this.field10066 >= -1) {
                  this.field10052 = 2;
                  return this.field10058;
               }

               OpenGL.glBindBufferARB(this.field10065, this.field10066);
               if (arg0) {
                  OpenGL.glBufferDataARBub(this.field10065, this.field10064, (byte[])null, 0, !this.field10063 ? 35044 : 35040);
                  if (this.field10054 <= this.field10047.field5125.field10258) {
                     this.field10052 = 1;
                     return this.field10047.field5125;
                  }
               }

               if (!arg2.method4793() && arg2.method4795(this.field10065, this.field10054, 35001)) {
                  this.field10052 = 2;
                  return arg2;
               }
            }

            return null;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10067[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10067[1] : field10067[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "<init>",
      descriptor = "(Lwi;IZ)V"
   )
   public class683(class494 arg0, int arg1, boolean arg2) {
      try {
         this.field10065 = arg1;
         this.field10063 = arg2;
         this.field10047 = arg0;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field10067[4] + (arg0 != null ? field10067[1] : field10067[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4985(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4986(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
