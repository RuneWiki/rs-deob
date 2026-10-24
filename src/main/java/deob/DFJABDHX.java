package deob;

@ObfuscatedName("DFJABDHX")
public class DFJABDHX {

	@ObfuscatedName("DFJABDHX.l")
	public int field564 = 0;

	@ObfuscatedName("DFJABDHX.m")
	public int field565 = 0;

	@ObfuscatedName("DFJABDHX.n")
	public int field566;

	@ObfuscatedName("DFJABDHX.o")
	public int field567;

	@ObfuscatedName("DFJABDHX.p")
	public int[][] field568;

	public DFJABDHX(int arg0, int arg1) {
		field566 = arg1;
		field567 = arg0;
		field568 = new int[field566][field567];
		method208();
	}

	@ObfuscatedName("DFJABDHX.a()V")
	public void method208() {
		for (int var1 = 0; var1 < field566; var1++) {
			for (int var2 = 0; var2 < field567; var2++) {
				if (var1 == 0 || var2 == 0 || field566 - 1 == var1 || field567 - 1 == var2) {
					field568[var1][var2] = 0xFFFFFF;
				} else {
					field568[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("DFJABDHX.a(IZIZII)V")
	public void method209(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg4 -= field564;
		arg3 -= field565;
		if (arg0 == 0) {
			if (arg2 == 0) {
				method212(arg4, arg3, 128);
				method212(arg4 - 1, arg3, 8);
			}

			if (arg2 == 1) {
				method212(arg4, arg3, 2);
				method212(arg4, arg3 + 1, 32);
			}

			if (arg2 == 2) {
				method212(arg4, arg3, 8);
				method212(arg4 + 1, arg3, 128);
			}

			if (arg2 == 3) {
				method212(arg4, arg3, 32);
				method212(arg4, arg3 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg2 == 0) {
				method212(arg4, arg3, 1);
				method212(arg4 - 1, arg3 + 1, 16);
			}

			if (arg2 == 1) {
				method212(arg4, arg3, 4);
				method212(arg4 + 1, arg3 + 1, 64);
			}

			if (arg2 == 2) {
				method212(arg4, arg3, 16);
				method212(arg4 + 1, arg3 - 1, 1);
			}

			if (arg2 == 3) {
				method212(arg4, arg3, 64);
				method212(arg4 - 1, arg3 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg2 == 0) {
				method212(arg4, arg3, 130);
				method212(arg4 - 1, arg3, 8);
				method212(arg4, arg3 + 1, 32);
			}

			if (arg2 == 1) {
				method212(arg4, arg3, 10);
				method212(arg4, arg3 + 1, 32);
				method212(arg4 + 1, arg3, 128);
			}

			if (arg2 == 2) {
				method212(arg4, arg3, 40);
				method212(arg4 + 1, arg3, 128);
				method212(arg4, arg3 - 1, 2);
			}

			if (arg2 == 3) {
				method212(arg4, arg3, 160);
				method212(arg4, arg3 - 1, 2);
				method212(arg4 - 1, arg3, 8);
			}
		}

		if (arg1) {
			if (arg0 == 0) {
				if (arg2 == 0) {
					method212(arg4, arg3, 0x10000);
					method212(arg4 - 1, arg3, 4096);
				}

				if (arg2 == 1) {
					method212(arg4, arg3, 1024);
					method212(arg4, arg3 + 1, 16384);
				}

				if (arg2 == 2) {
					method212(arg4, arg3, 4096);
					method212(arg4 + 1, arg3, 0x10000);
				}

				if (arg2 == 3) {
					method212(arg4, arg3, 16384);
					method212(arg4, arg3 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg2 == 0) {
					method212(arg4, arg3, 512);
					method212(arg4 - 1, arg3 + 1, 8192);
				}

				if (arg2 == 1) {
					method212(arg4, arg3, 2048);
					method212(arg4 + 1, arg3 + 1, 32768);
				}

				if (arg2 == 2) {
					method212(arg4, arg3, 8192);
					method212(arg4 + 1, arg3 - 1, 512);
				}

				if (arg2 == 3) {
					method212(arg4, arg3, 32768);
					method212(arg4 - 1, arg3 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg2 == 0) {
					method212(arg4, arg3, 66560);
					method212(arg4 - 1, arg3, 4096);
					method212(arg4, arg3 + 1, 16384);
				}

				if (arg2 == 1) {
					method212(arg4, arg3, 5120);
					method212(arg4, arg3 + 1, 16384);
					method212(arg4 + 1, arg3, 0x10000);
				}

				if (arg2 == 2) {
					method212(arg4, arg3, 20480);
					method212(arg4 + 1, arg3, 0x10000);
					method212(arg4, arg3 - 1, 1024);
				}

				if (arg2 == 3) {
					method212(arg4, arg3, 81920);
					method212(arg4, arg3 - 1, 1024);
					method212(arg4 - 1, arg3, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("DFJABDHX.a(IZIIIII)V")
	public void method210(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg2 -= field564;
		arg0 -= field565;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg4;
			arg4 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg2; var9 < arg2 + arg4; var9++) {
			if (var9 >= 0 && var9 < field566) {
				for (int var10 = arg0; var10 < arg0 + arg5; var10++) {
					if (var10 >= 0 && var10 < field567) {
						method212(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("DFJABDHX.a(BII)V")
	public void method211(int arg0, int arg1) {
		arg0 -= field564;
		arg1 -= field565;
		field568[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("DFJABDHX.a(III)V")
	public void method212(int arg0, int arg1, int arg2) {
		field568[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("DFJABDHX.a(ZIIIZI)V")
	public void method213(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
		arg1 -= field564;
		arg0 -= field565;
		if (arg4 == 0) {
			if (arg2 == 0) {
				method215(arg1, 128, arg0);
				method215(arg1 - 1, 8, arg0);
			}

			if (arg2 == 1) {
				method215(arg1, 2, arg0);
				method215(arg1, 32, arg0 + 1);
			}

			if (arg2 == 2) {
				method215(arg1, 8, arg0);
				method215(arg1 + 1, 128, arg0);
			}

			if (arg2 == 3) {
				method215(arg1, 32, arg0);
				method215(arg1, 2, arg0 - 1);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				method215(arg1, 1, arg0);
				method215(arg1 - 1, 16, arg0 + 1);
			}

			if (arg2 == 1) {
				method215(arg1, 4, arg0);
				method215(arg1 + 1, 64, arg0 + 1);
			}

			if (arg2 == 2) {
				method215(arg1, 16, arg0);
				method215(arg1 + 1, 1, arg0 - 1);
			}

			if (arg2 == 3) {
				method215(arg1, 64, arg0);
				method215(arg1 - 1, 4, arg0 - 1);
			}
		}

		if (arg4 == 2) {
			if (arg2 == 0) {
				method215(arg1, 130, arg0);
				method215(arg1 - 1, 8, arg0);
				method215(arg1, 32, arg0 + 1);
			}

			if (arg2 == 1) {
				method215(arg1, 10, arg0);
				method215(arg1, 32, arg0 + 1);
				method215(arg1 + 1, 128, arg0);
			}

			if (arg2 == 2) {
				method215(arg1, 40, arg0);
				method215(arg1 + 1, 128, arg0);
				method215(arg1, 2, arg0 - 1);
			}

			if (arg2 == 3) {
				method215(arg1, 160, arg0);
				method215(arg1, 2, arg0 - 1);
				method215(arg1 - 1, 8, arg0);
			}
		}

		if (arg3) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					method215(arg1, 0x10000, arg0);
					method215(arg1 - 1, 4096, arg0);
				}

				if (arg2 == 1) {
					method215(arg1, 1024, arg0);
					method215(arg1, 16384, arg0 + 1);
				}

				if (arg2 == 2) {
					method215(arg1, 4096, arg0);
					method215(arg1 + 1, 0x10000, arg0);
				}

				if (arg2 == 3) {
					method215(arg1, 16384, arg0);
					method215(arg1, 1024, arg0 - 1);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					method215(arg1, 512, arg0);
					method215(arg1 - 1, 8192, arg0 + 1);
				}

				if (arg2 == 1) {
					method215(arg1, 2048, arg0);
					method215(arg1 + 1, 32768, arg0 + 1);
				}

				if (arg2 == 2) {
					method215(arg1, 8192, arg0);
					method215(arg1 + 1, 512, arg0 - 1);
				}

				if (arg2 == 3) {
					method215(arg1, 32768, arg0);
					method215(arg1 - 1, 2048, arg0 - 1);
				}
			}

			if (arg4 == 2) {
				if (arg2 == 0) {
					method215(arg1, 66560, arg0);
					method215(arg1 - 1, 4096, arg0);
					method215(arg1, 16384, arg0 + 1);
				}

				if (arg2 == 1) {
					method215(arg1, 5120, arg0);
					method215(arg1, 16384, arg0 + 1);
					method215(arg1 + 1, 0x10000, arg0);
				}

				if (arg2 == 2) {
					method215(arg1, 20480, arg0);
					method215(arg1 + 1, 0x10000, arg0);
					method215(arg1, 1024, arg0 - 1);
				}

				if (arg2 == 3) {
					method215(arg1, 81920, arg0);
					method215(arg1, 1024, arg0 - 1);
					method215(arg1 - 1, 4096, arg0);
					return;
				}
			}
		}
	}

	@ObfuscatedName("DFJABDHX.b(IZIIIII)V")
	public void method214(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg4 -= field564;
		arg3 -= field565;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg0;
			arg0 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg4; var9 < arg0 + arg4; var9++) {
			if (var9 >= 0 && var9 < field566) {
				for (int var10 = arg3; var10 < arg3 + arg5; var10++) {
					if (var10 >= 0 && var10 < field567) {
						method215(var9, var7, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("DFJABDHX.a(IIIZ)V")
	public void method215(int arg0, int arg1, int arg2) {
		field568[arg0][arg2] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("DFJABDHX.b(III)V")
	public void method216(int arg0, int arg1) {
		arg1 -= field564;
		arg0 -= field565;
		field568[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("DFJABDHX.a(IBIIIII)Z")
	public boolean method217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg5 && arg2 == arg3) {
			return true;
		}

		arg5 -= field564;
		arg2 -= field565;
		arg1 -= field564;
		arg3 -= field565;
		if (arg4 == 0) {
			if (arg0 == 0) {
				if (arg1 - 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg3 + 1 == arg2 && (field568[arg5][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg3 - 1 == arg2 && (field568[arg5][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg1 == arg5 && arg3 + 1 == arg2) {
					return true;
				}

				if (arg1 - 1 == arg5 && arg2 == arg3 && (field568[arg5][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3 && (field568[arg5][arg2] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg1 + 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg3 + 1 == arg2 && (field568[arg5][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg3 - 1 == arg2 && (field568[arg5][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg1 == arg5 && arg3 - 1 == arg2) {
					return true;
				}

				if (arg1 - 1 == arg5 && arg2 == arg3 && (field568[arg5][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3 && (field568[arg5][arg2] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 2) {
			if (arg0 == 0) {
				if (arg1 - 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg3 + 1 == arg2) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3 && (field568[arg5][arg2] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg3 - 1 == arg2 && (field568[arg5][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 1) {
				if (arg1 - 1 == arg5 && arg2 == arg3 && (field568[arg5][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg3 + 1 == arg2) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg3 - 1 == arg2 && (field568[arg5][arg2] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg0 == 2) {
				if (arg1 - 1 == arg5 && arg2 == arg3 && (field568[arg5][arg2] & 0x1280108) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg3 + 1 == arg2 && (field568[arg5][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg3 - 1 == arg2) {
					return true;
				}
			} else if (arg0 == 3) {
				if (arg1 - 1 == arg5 && arg2 == arg3) {
					return true;
				}

				if (arg1 == arg5 && arg3 + 1 == arg2 && (field568[arg5][arg2] & 0x1280120) == 0) {
					return true;
				}

				if (arg1 + 1 == arg5 && arg2 == arg3 && (field568[arg5][arg2] & 0x1280180) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg3 - 1 == arg2) {
					return true;
				}
			}
		}

		if (arg4 == 9) {
			if (arg1 == arg5 && arg3 + 1 == arg2 && (field568[arg5][arg2] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg5 && arg3 - 1 == arg2 && (field568[arg5][arg2] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg5 && arg2 == arg3 && (field568[arg5][arg2] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg5 && arg2 == arg3 && (field568[arg5][arg2] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("DFJABDHX.a(IIIIIIB)Z")
	public boolean method218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg3 && arg1 == arg4) {
			return true;
		}

		arg3 -= field564;
		arg1 -= field565;
		arg2 -= field564;
		arg4 -= field565;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg5 = arg5 + 2 & 0x3;
			}

			if (arg5 == 0) {
				if (arg2 + 1 == arg3 && arg1 == arg4 && (field568[arg3][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 - 1 == arg1 && (field568[arg3][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg2 - 1 == arg3 && arg1 == arg4 && (field568[arg3][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 - 1 == arg1 && (field568[arg3][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg2 - 1 == arg3 && arg1 == arg4 && (field568[arg3][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 + 1 == arg1 && (field568[arg3][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg2 + 1 == arg3 && arg1 == arg4 && (field568[arg3][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg2 == arg3 && arg4 + 1 == arg1 && (field568[arg3][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 8) {
			if (arg2 == arg3 && arg4 + 1 == arg1 && (field568[arg3][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg3 && arg4 - 1 == arg1 && (field568[arg3][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg3 && arg1 == arg4 && (field568[arg3][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg3 && arg1 == arg4 && (field568[arg3][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("DFJABDHX.a(IIIIIIII)Z")
	public boolean method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg4 + arg5 - 1;
		int var9 = arg1 + arg6 - 1;
		if (arg3 >= arg5 && arg3 <= var8 && arg2 >= arg6 && arg2 <= var9) {
			return true;
		}

		if (arg5 - 1 == arg3 && arg2 >= arg6 && arg2 <= var9 && (field568[arg3 - field564][arg2 - field565] & 0x8) == 0 && (arg0 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg3 && arg2 >= arg6 && arg2 <= var9 && (field568[arg3 - field564][arg2 - field565] & 0x80) == 0 && (arg0 & 0x2) == 0) {
			return true;
		}

		if (arg6 - 1 == arg2 && arg3 >= arg5 && arg3 <= var8 && (field568[arg3 - field564][arg2 - field565] & 0x2) == 0 && (arg0 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg2 && arg3 >= arg5 && arg3 <= var8 && (field568[arg3 - field564][arg2 - field565] & 0x20) == 0 && (arg0 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
