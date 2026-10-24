package deob;

@ObfuscatedName("URWDWMOD")
public class URWDWMOD {

	@ObfuscatedName("URWDWMOD.f")
	public int field1306 = 0;

	@ObfuscatedName("URWDWMOD.g")
	public int field1307 = 0;

	@ObfuscatedName("URWDWMOD.h")
	public int field1308;

	@ObfuscatedName("URWDWMOD.i")
	public int field1309;

	@ObfuscatedName("URWDWMOD.j")
	public int[][] field1310;

	public URWDWMOD(int arg0, int arg1) {
		field1308 = arg0;
		field1309 = arg1;
		field1310 = new int[field1308][field1309];
		method500();
	}

	@ObfuscatedName("URWDWMOD.a()V")
	public void method500() {
		for (int var1 = 0; var1 < field1308; var1++) {
			for (int var2 = 0; var2 < field1309; var2++) {
				if (var1 == 0 || var2 == 0 || field1308 - 1 == var1 || field1309 - 1 == var2) {
					field1310[var1][var2] = 0xFFFFFF;
				} else {
					field1310[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("URWDWMOD.a(ZIIIIB)V")
	public void method501(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 -= field1306;
		arg4 -= field1307;
		if (arg1 == 0) {
			if (arg2 == 0) {
				method504(arg3, arg4, 128);
				method504(arg3 - 1, arg4, 8);
			}

			if (arg2 == 1) {
				method504(arg3, arg4, 2);
				method504(arg3, arg4 + 1, 32);
			}

			if (arg2 == 2) {
				method504(arg3, arg4, 8);
				method504(arg3 + 1, arg4, 128);
			}

			if (arg2 == 3) {
				method504(arg3, arg4, 32);
				method504(arg3, arg4 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg2 == 0) {
				method504(arg3, arg4, 1);
				method504(arg3 - 1, arg4 + 1, 16);
			}

			if (arg2 == 1) {
				method504(arg3, arg4, 4);
				method504(arg3 + 1, arg4 + 1, 64);
			}

			if (arg2 == 2) {
				method504(arg3, arg4, 16);
				method504(arg3 + 1, arg4 - 1, 1);
			}

			if (arg2 == 3) {
				method504(arg3, arg4, 64);
				method504(arg3 - 1, arg4 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg2 == 0) {
				method504(arg3, arg4, 130);
				method504(arg3 - 1, arg4, 8);
				method504(arg3, arg4 + 1, 32);
			}

			if (arg2 == 1) {
				method504(arg3, arg4, 10);
				method504(arg3, arg4 + 1, 32);
				method504(arg3 + 1, arg4, 128);
			}

			if (arg2 == 2) {
				method504(arg3, arg4, 40);
				method504(arg3 + 1, arg4, 128);
				method504(arg3, arg4 - 1, 2);
			}

			if (arg2 == 3) {
				method504(arg3, arg4, 160);
				method504(arg3, arg4 - 1, 2);
				method504(arg3 - 1, arg4, 8);
			}
		}

		if (arg0) {
			if (arg1 == 0) {
				if (arg2 == 0) {
					method504(arg3, arg4, 0x10000);
					method504(arg3 - 1, arg4, 4096);
				}

				if (arg2 == 1) {
					method504(arg3, arg4, 1024);
					method504(arg3, arg4 + 1, 16384);
				}

				if (arg2 == 2) {
					method504(arg3, arg4, 4096);
					method504(arg3 + 1, arg4, 0x10000);
				}

				if (arg2 == 3) {
					method504(arg3, arg4, 16384);
					method504(arg3, arg4 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg2 == 0) {
					method504(arg3, arg4, 512);
					method504(arg3 - 1, arg4 + 1, 8192);
				}

				if (arg2 == 1) {
					method504(arg3, arg4, 2048);
					method504(arg3 + 1, arg4 + 1, 32768);
				}

				if (arg2 == 2) {
					method504(arg3, arg4, 8192);
					method504(arg3 + 1, arg4 - 1, 512);
				}

				if (arg2 == 3) {
					method504(arg3, arg4, 32768);
					method504(arg3 - 1, arg4 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg2 == 0) {
					method504(arg3, arg4, 66560);
					method504(arg3 - 1, arg4, 4096);
					method504(arg3, arg4 + 1, 16384);
				}

				if (arg2 == 1) {
					method504(arg3, arg4, 5120);
					method504(arg3, arg4 + 1, 16384);
					method504(arg3 + 1, arg4, 0x10000);
				}

				if (arg2 == 2) {
					method504(arg3, arg4, 20480);
					method504(arg3 + 1, arg4, 0x10000);
					method504(arg3, arg4 - 1, 1024);
				}

				if (arg2 == 3) {
					method504(arg3, arg4, 81920);
					method504(arg3, arg4 - 1, 1024);
					method504(arg3 - 1, arg4, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("URWDWMOD.a(IIIIZII)V")
	public void method502(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg5 -= field1306;
		arg4 -= field1307;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg2;
			arg2 = arg0;
			arg0 = var8;
		}

		for (int var9 = arg5; var9 < arg2 + arg5; var9++) {
			if (var9 >= 0 && var9 < field1308) {
				for (int var10 = arg4; var10 < arg0 + arg4; var10++) {
					if (var10 >= 0 && var10 < field1309) {
						method504(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("URWDWMOD.a(IBI)V")
	public void method503(int arg0, int arg1) {
		arg1 -= field1306;
		arg0 -= field1307;
		field1310[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("URWDWMOD.a(III)V")
	public void method504(int arg0, int arg1, int arg2) {
		field1310[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("URWDWMOD.a(ZIZIII)V")
	public void method505(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg2 -= field1306;
		arg1 -= field1307;
		if (arg4 == 0) {
			if (arg3 == 0) {
				method507(arg2, 128, arg1);
				method507(arg2 - 1, 8, arg1);
			}

			if (arg3 == 1) {
				method507(arg2, 2, arg1);
				method507(arg2, 32, arg1 + 1);
			}

			if (arg3 == 2) {
				method507(arg2, 8, arg1);
				method507(arg2 + 1, 128, arg1);
			}

			if (arg3 == 3) {
				method507(arg2, 32, arg1);
				method507(arg2, 2, arg1 - 1);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg3 == 0) {
				method507(arg2, 1, arg1);
				method507(arg2 - 1, 16, arg1 + 1);
			}

			if (arg3 == 1) {
				method507(arg2, 4, arg1);
				method507(arg2 + 1, 64, arg1 + 1);
			}

			if (arg3 == 2) {
				method507(arg2, 16, arg1);
				method507(arg2 + 1, 1, arg1 - 1);
			}

			if (arg3 == 3) {
				method507(arg2, 64, arg1);
				method507(arg2 - 1, 4, arg1 - 1);
			}
		}

		if (arg4 == 2) {
			if (arg3 == 0) {
				method507(arg2, 130, arg1);
				method507(arg2 - 1, 8, arg1);
				method507(arg2, 32, arg1 + 1);
			}

			if (arg3 == 1) {
				method507(arg2, 10, arg1);
				method507(arg2, 32, arg1 + 1);
				method507(arg2 + 1, 128, arg1);
			}

			if (arg3 == 2) {
				method507(arg2, 40, arg1);
				method507(arg2 + 1, 128, arg1);
				method507(arg2, 2, arg1 - 1);
			}

			if (arg3 == 3) {
				method507(arg2, 160, arg1);
				method507(arg2, 2, arg1 - 1);
				method507(arg2 - 1, 8, arg1);
			}
		}

		if (arg0) {
			if (arg4 == 0) {
				if (arg3 == 0) {
					method507(arg2, 0x10000, arg1);
					method507(arg2 - 1, 4096, arg1);
				}

				if (arg3 == 1) {
					method507(arg2, 1024, arg1);
					method507(arg2, 16384, arg1 + 1);
				}

				if (arg3 == 2) {
					method507(arg2, 4096, arg1);
					method507(arg2 + 1, 0x10000, arg1);
				}

				if (arg3 == 3) {
					method507(arg2, 16384, arg1);
					method507(arg2, 1024, arg1 - 1);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg3 == 0) {
					method507(arg2, 512, arg1);
					method507(arg2 - 1, 8192, arg1 + 1);
				}

				if (arg3 == 1) {
					method507(arg2, 2048, arg1);
					method507(arg2 + 1, 32768, arg1 + 1);
				}

				if (arg3 == 2) {
					method507(arg2, 8192, arg1);
					method507(arg2 + 1, 512, arg1 - 1);
				}

				if (arg3 == 3) {
					method507(arg2, 32768, arg1);
					method507(arg2 - 1, 2048, arg1 - 1);
				}
			}

			if (arg4 == 2) {
				if (arg3 == 0) {
					method507(arg2, 66560, arg1);
					method507(arg2 - 1, 4096, arg1);
					method507(arg2, 16384, arg1 + 1);
				}

				if (arg3 == 1) {
					method507(arg2, 5120, arg1);
					method507(arg2, 16384, arg1 + 1);
					method507(arg2 + 1, 0x10000, arg1);
				}

				if (arg3 == 2) {
					method507(arg2, 20480, arg1);
					method507(arg2 + 1, 0x10000, arg1);
					method507(arg2, 1024, arg1 - 1);
				}

				if (arg3 == 3) {
					method507(arg2, 81920, arg1);
					method507(arg2, 1024, arg1 - 1);
					method507(arg2 - 1, 4096, arg1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("URWDWMOD.b(IIIIZII)V")
	public void method506(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg3) {
			var7 += 0x20000;
		}

		arg5 -= field1306;
		arg1 -= field1307;

		if (arg4 == 1 || arg4 == 3) {
			int var8 = arg0;
			arg0 = arg2;
			arg2 = var8;
		}

		for (int var9 = arg5; var9 < arg0 + arg5; var9++) {
			if (var9 >= 0 && var9 < field1308) {
				for (int var10 = arg1; var10 < arg1 + arg2; var10++) {
					if (var10 >= 0 && var10 < field1309) {
						method507(var9, var7, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("URWDWMOD.a(IIZI)V")
	public void method507(int arg0, int arg1, int arg2) {
		field1310[arg0][arg2] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("URWDWMOD.a(ZII)V")
	public void method508(int arg0, int arg1) {
		arg0 -= field1306;
		arg1 -= field1307;
		field1310[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("URWDWMOD.a(IIIIIII)Z")
	public boolean method509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg3 && arg1 == arg4) {
			return true;
		}

		arg3 -= field1306;
		arg1 -= field1307;
		arg2 -= field1306;
		arg4 -= field1307;
		if (arg0 == 0) {
			if (arg5 == 0) {
				if (arg2 - 1 == arg3 && arg1 == arg4) {
					return true;
				}

				if (arg2 == arg3 && arg4 + 1 == arg1 && (field1310[arg3][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 - 1 == arg1 && (field1310[arg3][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg2 == arg3 && arg4 + 1 == arg1) {
					return true;
				}

				if (arg2 - 1 == arg3 && arg1 == arg4 && (field1310[arg3][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg3 && arg1 == arg4 && (field1310[arg3][arg1] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg2 + 1 == arg3 && arg1 == arg4) {
					return true;
				}

				if (arg2 == arg3 && arg4 + 1 == arg1 && (field1310[arg3][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 - 1 == arg1 && (field1310[arg3][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg2 == arg3 && arg4 - 1 == arg1) {
					return true;
				}

				if (arg2 - 1 == arg3 && arg1 == arg4 && (field1310[arg3][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 + 1 == arg3 && arg1 == arg4 && (field1310[arg3][arg1] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 2) {
			if (arg5 == 0) {
				if (arg2 - 1 == arg3 && arg1 == arg4) {
					return true;
				}

				if (arg2 == arg3 && arg4 + 1 == arg1) {
					return true;
				}

				if (arg2 + 1 == arg3 && arg1 == arg4 && (field1310[arg3][arg1] & 0x1280180) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 - 1 == arg1 && (field1310[arg3][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg2 - 1 == arg3 && arg1 == arg4 && (field1310[arg3][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 + 1 == arg1) {
					return true;
				}

				if (arg2 + 1 == arg3 && arg1 == arg4) {
					return true;
				}

				if (arg2 == arg3 && arg4 - 1 == arg1 && (field1310[arg3][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg2 - 1 == arg3 && arg1 == arg4 && (field1310[arg3][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 + 1 == arg1 && (field1310[arg3][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg3 && arg1 == arg4) {
					return true;
				}

				if (arg2 == arg3 && arg4 - 1 == arg1) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg2 - 1 == arg3 && arg1 == arg4) {
					return true;
				}

				if (arg2 == arg3 && arg4 + 1 == arg1 && (field1310[arg3][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 + 1 == arg3 && arg1 == arg4 && (field1310[arg3][arg1] & 0x1280180) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 - 1 == arg1) {
					return true;
				}
			}
		}

		if (arg0 == 9) {
			if (arg2 == arg3 && arg4 + 1 == arg1 && (field1310[arg3][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg3 && arg4 - 1 == arg1 && (field1310[arg3][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg3 && arg1 == arg4 && (field1310[arg3][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg3 && arg1 == arg4 && (field1310[arg3][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("URWDWMOD.b(IIIIIII)Z")
	public boolean method510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg2 && arg3 == arg5) {
			return true;
		}

		arg2 -= field1306;
		arg3 -= field1307;
		arg1 -= field1306;
		arg5 -= field1307;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}

			if (arg4 == 0) {
				if (arg1 + 1 == arg2 && arg3 == arg5 && (field1310[arg2][arg3] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg5 - 1 == arg3 && (field1310[arg2][arg3] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg1 - 1 == arg2 && arg3 == arg5 && (field1310[arg2][arg3] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg5 - 1 == arg3 && (field1310[arg2][arg3] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg1 - 1 == arg2 && arg3 == arg5 && (field1310[arg2][arg3] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg5 + 1 == arg3 && (field1310[arg2][arg3] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg1 + 1 == arg2 && arg3 == arg5 && (field1310[arg2][arg3] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg2 && arg5 + 1 == arg3 && (field1310[arg2][arg3] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 8) {
			if (arg1 == arg2 && arg5 + 1 == arg3 && (field1310[arg2][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg2 && arg5 - 1 == arg3 && (field1310[arg2][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg2 && arg3 == arg5 && (field1310[arg2][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg2 && arg3 == arg5 && (field1310[arg2][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("URWDWMOD.a(IBIIIIII)Z")
	public boolean method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg3 + arg5 - 1;
		int var9 = arg4 + arg6 - 1;
		if (arg0 >= arg3 && arg0 <= var8 && arg2 >= arg4 && arg2 <= var9) {
			return true;
		}

		if (arg3 - 1 == arg0 && arg2 >= arg4 && arg2 <= var9 && (field1310[arg0 - field1306][arg2 - field1307] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg0 && arg2 >= arg4 && arg2 <= var9 && (field1310[arg0 - field1306][arg2 - field1307] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		}

		if (arg4 - 1 == arg2 && arg0 >= arg3 && arg0 <= var8 && (field1310[arg0 - field1306][arg2 - field1307] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg2 && arg0 >= arg3 && arg0 <= var8 && (field1310[arg0 - field1306][arg2 - field1307] & 0x20) == 0 && (arg1 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
